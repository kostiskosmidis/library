/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.dao;

import java.io.Serializable;
import java.util.List;
import nullcipher.entity.Category;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImpl extends SuperDao implements CategoryDao{

    @Override
    public List<Category> findAll() {
         Query query = getSession().createNamedQuery("Category.findAll", Category.class);
        List<Category> list = query.getResultList();
        return list;
    }

    @Override
    public Serializable add(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category findById(int id) {
       Query<Category> query = getSession().createNamedQuery("Category.findById", Category.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    
}
