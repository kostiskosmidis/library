/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.service;

import java.util.List;
import nullcipher.entity.Author;
import nullcipher.entity.Book;


/**
 *
 * @author kostis
 */
public interface AuthorService {
    List<Author> findAll();

    public Author findById(int id);
}
