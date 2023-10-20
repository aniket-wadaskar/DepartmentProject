package com.cg.dao;

import java.util.List;

import com.cg.entity.Department;

public interface DepartmentDao {
	
	Department saveDepartment(Department department); // save the department
	
	List<Department> fetchDepartmentList();           // Read the list 
	
	void deleteDepartmentById(Long departmentId); // Delete the department
                          
}
