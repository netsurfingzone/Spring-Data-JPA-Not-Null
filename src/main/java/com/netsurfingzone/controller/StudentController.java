package com.netsurfingzone.controller;

import com.netsurfingzone.entity.Student;
import com.netsurfingzone.repository.StudentRepository;
import com.netsurfingzone.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/create")
    public Student createStudent1(@RequestBody Student student) {
        Student createResponse = studentService.save(student);
        return createResponse;
    }

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		Student updateResponse = studentService.update(student);
		return updateResponse;
	}

/*	@GetMapping("/{id}")
	public Student getStudent(@PathVariable Long id) {
		Student getReponse = studentService.get(id);
		return getReponse;
	}*/

/*	@GetMapping("/{name}")
	public List<Student> getStudent(@PathVariable String name) {
		List<Student> getReponse = studentService.getStudents(name);
		return getReponse;
	}*/

	@GetMapping("/{students}")
	public List<Student> getStudent() {
		List<Student> getReponse = studentService.getStudents();
		return getReponse;
	}
	@DeleteMapping("/delete")
	public String deleteStudent(@RequestBody Student student) {
		studentService.delete(student);
		return "Record deleted succesfully";
	}

	@GetMapping("/getcustomfieldsbasisofuserinput")
	public String deleteStudent(@RequestParam String fields) {
		System.out.println(fields);
		//studentService.delete(student);
		return "Record deleted succesfully";
	}

}