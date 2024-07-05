package com.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modal.Department;

@Repository
public interface DeptRepository extends JpaRepository<Department,Integer> {

}
