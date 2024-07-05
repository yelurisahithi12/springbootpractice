package com.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Department;
import com.modal.Student;


@Service
public class DeptDao {
	
	@Autowired
	DeptRepository deptRepository;
	

	public void registerDept(Department department){
		deptRepository.save(department);
	}
	
	public Department getDept(int empId){
		return deptRepository.findById(empId).orElse(new Department());
	}

	public List<Department> getAllDept(){
		return deptRepository.findAll();
	}	
}

