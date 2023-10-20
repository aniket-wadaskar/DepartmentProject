package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dao.DepartmentDao;
import com.cg.entity.Department;
import com.cg.repository.DepartmentRepository;

public class DepartmentService implements DepartmentDao {
	 @Autowired
	    private DepartmentRepository departmentRepository;
	 
	    // save operation
	    @Override
	    public Department saveDepartment(Department department) {
	        return departmentRepository.save(department);
	    }
	 
	    // read operation
	    @Override
	    public List<Department> fetchDepartmentList() {
	        return (List<Department>) departmentRepository.findAll();
	    }
	 
	   
	 
	    // delete operation
	    @Override
	    public void deleteDepartmentById(Long departmentId) {
	        departmentRepository.deleteById(departmentId);
	    }
	 
	}



