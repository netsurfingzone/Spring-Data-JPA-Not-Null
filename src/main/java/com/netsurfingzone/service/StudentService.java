package com.netsurfingzone.service;

import com.netsurfingzone.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {

    public Student save(Student student);

    public Student update(Student student);

    public Student get(Long id);

    /*public List<Student> getStudents(String name);*/

    public List<Student> getStudents();

    public void delete(Student student);
}