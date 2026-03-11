package com.example.learn_spring_boot;

public class Course {
    private long id;
    private String name;
    private String author;

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }
}
