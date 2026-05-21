package com.spring_boot_learn.jpa_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot_learn.jpa_hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long>{
    List<Course> findAllByAuthor(String author);
}