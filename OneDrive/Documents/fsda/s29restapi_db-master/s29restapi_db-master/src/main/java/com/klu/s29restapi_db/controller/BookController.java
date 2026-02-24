package com.klu.s29restapi_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klu.s29restapi_db.entity.Book;
import com.klu.s29restapi_db.service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    // CREATE
    @PostMapping("/books")
    public String addBook(@RequestBody Book b) {
        return bookService.saveBook(b);
    }

    // READ BY ID
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    // READ ALL
    @GetMapping("/books")
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }
    
    @PutMapping("/books/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Book newBookDetails) {
        return bookService.updateBook(id, newBookDetails);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookService.deleteBook(id);
    }
}
