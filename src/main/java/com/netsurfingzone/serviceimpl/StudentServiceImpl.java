package com.netsurfingzone.serviceimpl;

import com.netsurfingzone.entity.Student;
import com.netsurfingzone.repository.StudentRepository;
import com.netsurfingzone.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Transactional
    public Student save(Student student) {
        Student createResponse = null;
        createResponse = studentRepository.save(student);

        //createResponse = studentRepository.save(student);
        return createResponse;
    }

    @Transactional
    public Student update(Student student) {
        Student updateResponse = studentRepository.save(student);
        return updateResponse;
    }

    @Transactional
    public Student get(Long id) {
        Optional<Student> response = studentRepository.findById(id);
        Student getResponse = response.get();
        //String sql = "select name from student";
        //List<String> names =  jdbcTemplate.queryForList(sql,  String.class);
        //return names;
        return getResponse;
    }

    @Transactional
    public List<Student> getStudents() {
        List<Student> response = new ArrayList<>();
       response = studentRepository.findByNameNotNullAndUniversityNotNull();
        //Student getResponse = response.get();
        //String sql = "select name from student";
        //List<String> names =  jdbcTemplate.queryForList(sql,  String.class);
        //return names;
        return response;
    }

    @Transactional
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}