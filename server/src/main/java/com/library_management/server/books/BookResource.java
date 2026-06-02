package com.library_management.server.books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {

    @Autowired
    private BookRepository repository;

    @GetMapping("/")
    public String getMethodName(@RequestParam String param) {
        return new String("Hiii");
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(@RequestParam(required = false) String name,
            @RequestParam(required = false) String genre) {

        System.out.println("name : " + name);
        System.out.println("genre : " + genre);

        if (name == null && genre == null) {
            return repository.findAll();
        }
        return repository.findByNameOrGenre(name, genre);
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable int id) {
        Optional<Book> foundBook = repository.findById(id);

        if (!foundBook.isPresent()) {
            throw new RuntimeException("Book Not Found");
        }

        return foundBook.get();
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        repository.save(book);
        return book;
    }

}
