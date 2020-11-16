/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.controller;

import java.util.List;
import nullcipher.entity.Author;
import nullcipher.entity.Book;
import nullcipher.entity.Category;
import nullcipher.service.AuthorService;
import nullcipher.service.BookService;
import nullcipher.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/book")
public class BookController {
    
    @Autowired//Dependency Injection
    private BookService service;
    
    @Autowired
    private AuthorService authorService;
    
    @Autowired
    private CategoryService categoryService;
    
    @ModelAttribute("authors")
    public List<Author> getAuthors(){
        return authorService.findAll();
    }
    
     @ModelAttribute("categories")
    public List<Category> getCategories(){
        return categoryService.findAll();
    }
    
    @RequestMapping
    public String showCustomers(Model model){
        List<Book> books = service.findAll();
        model.addAttribute("books", books);
        return "book/list";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView showBookForm(ModelAndView model){
        model.setViewName("book/create");//  WEB-INF/view/customer/create.jsp
        model.addObject("book", new Book());
        return model; 
    }
    
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createBook(@ModelAttribute("book") Book book, RedirectAttributes ra){
        int id = service.create(book);
        String minima = "Book successfully created with id:"+id;
        ra.addFlashAttribute("bookMessage", minima);
        return "redirect:/book";
    }
    
    @RequestMapping(value = "/delete", method = RequestMethod.GET )
    public String deleteBook(@RequestParam("id") int id, RedirectAttributes ra){
        
        String message = service.delete(id);
        ra.addFlashAttribute("message", message);
        return "redirect:/book";
    }
    
    
    
}
