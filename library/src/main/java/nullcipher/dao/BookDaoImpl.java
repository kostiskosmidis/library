
package nullcipher.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.PersistenceException;
import nullcipher.entity.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl extends SuperDao implements BookDao {

  @Override
    public List<Book> findAll() {
        Query query = getSession().createNamedQuery("Book.findAll", Book.class);
        List<Book> list = query.getResultList();
        return list;
    }

    @Override
    public Serializable add(Book book) {
       
        Serializable identifier = getSession().save(book);
        return identifier;
        }


    @Override
    public String remove(int id) {
        
        Query q = getSession().createNamedQuery("Book.deleteById");
        q.setParameter("id", id);
        String message  = "Book deleted successfully";
        try{
        
         int result = q.executeUpdate();
       
        }catch(PersistenceException e){
            
            message ="Book cannot be deleted";
        
        }
        
        return message;
    }

    @Override
    public void update(Book book) {
        getSession().saveOrUpdate(book);
    }

    @Override
    public Book findById(int id) {
         Query<Book> query = getSession().createNamedQuery("Book.findById", Book.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    
    
    
}
