package com.spring_boot_learn.jpa_hibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Course {

    @Id
    private long id;

    @Column
    private String name;
    
    @Column (name="author") // column is annotation is optional 
    private String author;

    public Course() {

    }

    public Course(long id,String author,  String name) {
        this.author = author;
        this.id = id;
        this.name = name;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }



}
