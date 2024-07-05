package com.ts;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;
import com.modal.Employee;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeDao empDao;
	@RequestMapping("showEmployee")
    public Employee showEmployee(){
		
    	Employee employee = new Employee();
    	employee.setId(1);
    	employee.setName("sahithi");
    	employee.setSalary(99999.99);
    	return employee;
    	 }
	@RequestMapping("showAllEmployees")
	public  List <Employee> showAllEmployees(){
		List<Employee>list = new  ArrayList();
		return empDao.getAllEmployees();
		}
	
	@RequestMapping("showEmployeeById/{id}")
	public Employee showEmployeeById(@PathVariable int id){
		 List<Employee> employees = showAllEmployees();

	return empDao.getEmployeeById(id);
	}
	@RequestMapping("showEmployeeByName/{name}")
	public Employee showEmployeeByName(@PathVariable String name){
		List<Employee> employees = showAllEmployees();

		return empDao.getEmployeeByName(name) ;
	}
	@PostMapping("register")
	public void register(@RequestBody  Employee employee){
		System.out.println("Data received :" + employee);
		empDao.register(employee);
	}
//	@PutMapping("updateEmployee/{id}")
	//public void updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
//        Employee existingEmployee = empDao.getEmployeeById(id);
//        if (existingEmployee != null) {
//           
//            existingEmployee.setName(updatedEmployee.getName());
//            existingEmployee.setSalary(updatedEmployee.getSalary());
//        
//            empDao.updateEmployee(existingEmployee);
//        
//    }
//}
	@PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee updatedEmployee) {
        return empDao.save(updatedEmployee);
    }
	@DeleteMapping("deleteEmployee/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
        empDao.deleteById(id);
    }
}
	


