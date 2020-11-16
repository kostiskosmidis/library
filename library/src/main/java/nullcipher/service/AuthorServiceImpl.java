/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.service;

import java.util.List;
import javax.transaction.Transactional;
import nullcipher.dao.AuthorDao;

import nullcipher.entity.Author;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{

    
    @Autowired
    private AuthorDao adao;
    
    @Override
    public List<Author> findAll() {
        return adao.findAll();
    }

    @Override
    public Author findById(int id) {
        return adao.findById(id);
    }
    
    
}
