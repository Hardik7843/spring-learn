package com.spring_boot_learn.jpa_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.spring_boot_learn.jpa_hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class, id);
    }

    public Course update(Course course)
    {
        return entityManager.merge(course);
    }

    public void deleteOne(long id){
        Course courseToBeDeleted = entityManager.find(Course.class, id);
        entityManager.remove(courseToBeDeleted);
    }
}
