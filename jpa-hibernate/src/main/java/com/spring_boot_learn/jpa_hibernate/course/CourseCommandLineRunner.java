package com.spring_boot_learn.jpa_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring_boot_learn.jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class  CourseCommandLineRunner implements CommandLineRunner {

    // @Autowired
    // private  CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository; 

    // @Override
    // public void run(String... args) throws Exception {
    //     repository.insert(new Course(1, "Java Spring Boot JPA", "inMinutes"));
    //     repository.insert(new Course(2, "Azure DevOps JPA", "inMinutes"));
        
    //     repository.deleteOne(1);

    //     repository.insert(new Course(3, "AWS cloud JPA", "inMinutes"));

    //     repository.update(new Course( 3, "AWS Ecosystem JPA", "Hardik"));
    //     Course c = repository.findById(2);

    //     System.out.println("Course "+ c);
    // }
    
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Java Spring Boot JPA", "inMinutes"));
        repository.save(new Course(2, "Azure DevOps JPA", "inMinutes"));
        repository.save(new Course(3, "GCP DevOps JPA", "inMinutes"));
        
        repository.deleteById(1l);

        // System.out.println(repository.findById(2l));

        // System.out.println(repository.findAll());

        System.out.println(repository.findAllByAuthor("inMinutes"));
    }

    



}