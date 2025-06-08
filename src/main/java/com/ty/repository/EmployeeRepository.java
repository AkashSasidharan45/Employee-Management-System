package com.ty.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ty.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	

}
