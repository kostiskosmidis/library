/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullcipher.controller;

import java.util.List;
import nullcipher.entity.Author;
import nullcipher.entity.Book;
import nullcipher.service.AuthorService;
import nullcipher.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/author")
public class AuthorController {
    
    
    
    @Autowired//Dependency Injection
    private AuthorService service;
    
    @RequestMapping
    public String showAuthors(Model model){
        List<Author> authors = service.findAll();
        model.addAttribute("authors", authors);
        return "author/manage";
    }
}
