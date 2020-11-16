
package nullcipher.service;

import java.util.List;
import nullcipher.entity.Book;


public interface BookService {
    List<Book> findAll();
    
    int create(Book book);
    
    String delete(int id);

    public Book findById(int id);
}
