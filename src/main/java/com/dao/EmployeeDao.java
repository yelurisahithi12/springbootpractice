package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Employee;
@Service
public class EmployeeDao {
	@Autowired //dependency injection
	private EmpRepo empRepo;
	public void register(Employee employee){
		empRepo.save(employee);
		
	}
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	public Employee getEmployeeById(Integer id){
		return empRepo.findById(id).orElse(new Employee());
	}
	
	public Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
	return empRepo.findByName(name);
	}
//	public Employee updateEmployee(Employee existingEmployee) {
//		// TODO Auto-generated method stub
//	return	empRepo.save(existingEmployee);
//	
//		
//	}
	public Employee save(Employee updatedEmployee) {
        return empRepo.save(updatedEmployee);
    }
	
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
	}
	
	


}
