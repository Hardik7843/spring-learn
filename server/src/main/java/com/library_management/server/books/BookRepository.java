package com.library_management.server.books;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByNameOrGenre(String name, String genre);

    void deleteById(Integer id);
}
