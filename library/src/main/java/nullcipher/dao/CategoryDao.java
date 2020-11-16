/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.dao;

import java.io.Serializable;
import java.util.List;
import nullcipher.entity.Category;

/**
 *
 * @author kostis
 */
public interface CategoryDao {
     List<Category> findAll();
    public Serializable add(Category category);
    public String remove(int id);
    void update(Category category);

    public Category findById(int id);
}
