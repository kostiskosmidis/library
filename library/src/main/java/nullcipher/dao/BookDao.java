/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.dao;

import java.io.Serializable;
import java.util.List;
import nullcipher.entity.Book;

/**
 *
 * @author kostis
 */
public interface BookDao {
    
    List<Book> findAll();
    public Serializable add(Book book);
    public String remove(int id);
    void update(Book book);

    public Book findById(int id);
}
