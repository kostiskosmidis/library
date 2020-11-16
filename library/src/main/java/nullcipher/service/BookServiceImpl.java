/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.service;

import java.util.List;
import javax.transaction.Transactional;
import nullcipher.dao.BookDao;
import nullcipher.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bdao;
    
    @Override
    public List<Book> findAll() {
        return bdao.findAll();
    }

    @Override
    public int create(Book book) {
         int id = (Integer)bdao.add(book);
        return id;
    }
    
     @Override
    public String delete(int id) {
        
        return bdao.remove(id);
    }

    @Override
    public Book findById(int id) {
        return bdao.findById(id);
    }
    
    
}
