package com.ty.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ty.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
