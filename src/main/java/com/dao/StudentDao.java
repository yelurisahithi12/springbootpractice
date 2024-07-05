package com.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Student;

@Service
public class StudentDao {

	@Autowired
	StudentRpository studentRpository;	
	
	public void register(Student student){
		studentRpository.save(student);
	}
	public Student getStudent(int id){
		return studentRpository.findById(id).orElse(new Student()); 
	}
	public List<Student> getAllStudents(){
		return studentRpository.findAll();
	}
}

