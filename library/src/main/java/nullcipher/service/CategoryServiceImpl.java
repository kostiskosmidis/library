/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.service;

import java.util.List;
import javax.transaction.Transactional;
import nullcipher.dao.CategoryDao;
import nullcipher.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDao cdao;
    @Override
    public List<Category> findAll() {
        
        return cdao.findAll();
    }

    @Override
    public Category findById(int id) {
        return cdao.findById(id);
    }
    
}
