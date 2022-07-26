package com.netsurfingzone.repository;

import com.netsurfingzone.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

    List<Student> findByNameNotNull();
    List<Student> findByNameNotNullAndUniversityNotNull();
}