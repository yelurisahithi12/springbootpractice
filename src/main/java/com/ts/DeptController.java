package com.ts;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DeptDao;
import com.modal.Department;

@RestController
public class DeptController {
	
	@Autowired
	private DeptDao deptDao;  //dependency injection
	
	@RequestMapping("registerDept")
	public void register(@RequestBody Department d1){
		deptDao.registerDept(d1);
	}
	
	@RequestMapping("getAllDepts")
	public List <Department> getAllDepts(){
		return deptDao.getAllDept();
	}
	@RequestMapping("getDeptById/{id}")
	public Department getDeptById(@PathVariable("id") int empId){
		return deptDao.getDept(empId); 
	}
}

