package com.spring_boot_learn.jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring_boot_learn.jpa_hibernate.course.Course;


@Component
public class  CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private  CourseJdbcRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Java Spring Boot", "inMinutes"));
        
        repository.deleteOne(1);

        repository.insert(new Course(2, "Java Spring Boot", "inMinutes"));


        Course c = repository.findById(2);

        System.out.println("Course "+ c);
    }
    



}