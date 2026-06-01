package com.library_management.books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {

    @Autowired
    private BookRepository repository;

    @GetMapping("/books")
    public List<Book> getAllBooks(@RequestParam(required = false) String name,
            @RequestParam(required = false) String genre) {
        return repository.findAll();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id) {
        Optional<Book> foundBook = repository.findById(id);

        if (!foundBook.isPresent()) {
            throw new RuntimeException("Book Not Found");
        }

        return foundBook.get();
    }

}
