package com.ts;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.StudentDao;
import com.modal.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentDao studentDao;//dependency injection
	
	@RequestMapping("registerStudent")
    public String registerStudent(@RequestBody Student student) {
        studentDao.register(student);
        return "Student registration successful.";
    }
	
	@RequestMapping("getAllStudents")
	public List <Student> getAllStudents(){
			return studentDao.getAllStudents();
	}
	@RequestMapping("getStudentById/{id}")
	public Student getStudentById(@PathVariable("id") Integer id){
		return studentDao.getStudent(id);
	}
}

