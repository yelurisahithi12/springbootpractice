package com.modal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity									
public class Department {
	@Id@GeneratedValue
	private int deptId;
	private String deptName;
	private String location;
	
	@JsonBackReference
	@OneToMany(mappedBy="department")
	 private List<Employee> empList = new ArrayList<Employee>();
	@JsonIgnore
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(int deptId, String deptName, String location, List<Employee> empList) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
		
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + ", empList="
				+ empList + "]";
	}	
	
}
