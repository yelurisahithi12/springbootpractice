package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modal.Student;

public interface StudentRpository  extends  JpaRepository<Student,Integer>{

}
