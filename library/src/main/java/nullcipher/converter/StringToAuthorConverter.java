package nullcipher.converter;



import nullcipher.entity.Author;
import nullcipher.entity.Book;
import nullcipher.service.AuthorService;
import nullcipher.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToAuthorConverter implements Converter<String, Author>{

    @Autowired
    private AuthorService service;
    
    @Override
    public Author convert(String source) {
        //Get the id of the breadSize selection
        //Find the Entity from the Database
        //Return the Entity
        int id = Integer.parseInt(source);
        Author size = service.findById(id);
        return size;
    }
    
    
}
