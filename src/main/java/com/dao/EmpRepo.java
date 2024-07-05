package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.modal.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {
	//Optional<Employee> findByName(String name);
	@Query("SELECT  e  FROM Employee e WHERE e.name=:name")
	Employee findByName(@Param("name") String name);
	
	@Query("SELECT  e  FROM Employee e WHERE e.emailId=:emailId AND e.password=:password")
	Employee findByEmail(@Param("emailId") String emailId, @Param("password") String password);
	
	Employee save(Employee employee);

}
