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


/**
 *
 * @author kostis
 */
public interface AuthorDao {
      List<Author> findAll();
    public Serializable add(Author author);
    public String remove(int id);
    void update(Author author);

    public Author findById(int id);
}
