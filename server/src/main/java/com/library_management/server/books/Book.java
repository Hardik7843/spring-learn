package com.library_management.server.books;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column
    @NotNull
    @Size(min = 3, message = "Minimum 3 Characters for book name")
    private String name;

    @Column
    @NotNull
    @Size(min = 3, message = "Minimum 3 Characters for book genre")
    private String genre;

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(Integer id, @Size(min = 3, message = "Minimum 3 Characters for book name") String name,
            @Size(min = 3, message = "Minimum 3 Characters for book genre") String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", genre=").append(genre);
        sb.append('}');
        return sb.toString();
    }

}
