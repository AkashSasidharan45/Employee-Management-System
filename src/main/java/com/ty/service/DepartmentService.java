package com.ty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.entity.Department;
import com.ty.entity.Employee;
import com.ty.repository.DepartmentRepository;
import com.ty.repository.EmployeeRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	// creating department
	public Department createDepartment(Department department) {
		try {
			return departmentRepository.save(department);
		} catch (Exception e) {
			throw new RuntimeException("Failed to create department: " + e.getMessage());
		}
	}

	// assign department head
	public Department setDepartmentHead(Department department) {

		Integer deptId = department.getDeptId();
		if (deptId == null) {
			throw new IllegalArgumentException("Department ID must not be null.");
		}

		Integer empId = department.getDeptId() != null ? department.getDeptHead().getEmpId() : null;

		if (empId == null) {
			throw new IllegalArgumentException("Department Head Employee ID must not be null.");
		}

		Department department2 = departmentRepository.findById(deptId).orElseThrow();
		Employee employee = employeeRepository.findById(empId).orElseThrow();
		department2.setDeptHead(employee);
		return departmentRepository.save(department2);
	}

	// delete Department
	public void deleteDepartment(Department department) {
		if (department != null && department.getDeptId() != null) {
			Department existingDepartment = departmentRepository.findById(department.getDeptId()).orElseThrow();
			departmentRepository.delete(existingDepartment);
		}
	}

//update Department
	public Department updateDepartment(Department department) {
		Integer deptId = department.getDeptId();
		Department existingDepartment = departmentRepository.findById(deptId).orElseThrow();

		if (department != null && department.getDeptId() != null) {

			if (department.getDeptName() != null) {
				existingDepartment.setDeptName(department.getDeptName());
			}
			if (department.getCreationDate() != null) {
				existingDepartment.setCreationDate(department.getCreationDate());
			}

		}
		return departmentRepository.save(existingDepartment);
	}

//getAllDepartments
	public Iterable<Department> getAllDepartments() {

		return departmentRepository.findAll();
	}

//expand to get employee under given department
	public Department expandDepartment(Integer id, boolean expandEmployee) {
		Department department = departmentRepository.findById(id).orElseThrow();

		if (expandEmployee) {
			department.getEmployee().size();
		} else {
			department.setEmployee(null);
		}
		return department;

	}

}
