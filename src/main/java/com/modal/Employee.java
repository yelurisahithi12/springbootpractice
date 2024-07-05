package com.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double salary;
	private String emailId;
	private String password;
	 @JsonIgnore
	@JsonManagedReference
	 @ManyToOne
	 @JoinColumn(name = "dept_id")

	private Department department;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int id, String name, double salary, String emailId, String password) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.emailId = emailId;
		this.password = password;
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", emailId=" + emailId + ", password="
				+ password + ", department=" + department + "]";
	}
	
}

	

	
