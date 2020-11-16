package nullcipher.converter;



import nullcipher.entity.Author;
import nullcipher.entity.Book;
import nullcipher.entity.Category;
import nullcipher.service.AuthorService;
import nullcipher.service.BookService;
import nullcipher.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToCategoryConverter implements Converter<String, Category>{

    @Autowired
    private CategoryService service;
    
    @Override
    public Category convert(String source) {
        //Get the id of the breadSize selection
        //Find the Entity from the Database
        //Return the Entity
        int id = Integer.parseInt(source);
        Category size = service.findById(id);
        return size;
    }
    
    
}
