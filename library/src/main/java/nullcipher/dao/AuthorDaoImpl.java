/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.dao;

import java.io.Serializable;
import java.util.List;
import nullcipher.entity.Author;
import nullcipher.entity.Book;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorDaoImpl extends SuperDao implements AuthorDao{

    @Override
    public List<Author> findAll() {
         Query query = getSession().createNamedQuery("Author.findAll", Author.class);
        List<Author> list = query.getResultList();
        return list;
    }

    @Override
    public Serializable add(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Author author) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Author findById(int id) {
        Query<Author> query = getSession().createNamedQuery("Author.findById", Author.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    
}
