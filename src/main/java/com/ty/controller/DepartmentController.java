package com.ty.controller;

import com.ty.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.entity.Department;
import com.ty.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private DepartmentService departmentService;

	// save Department
	@PostMapping("/create")
	public Department createDepartment(@RequestBody Department department) {
		return departmentService.createDepartment(department);

	}

	// assign dept Head
	@PostMapping("/assignDeptHead")
	public Department setDepartmentHead(@RequestBody Department department) {

		return departmentService.setDepartmentHead(department);
	}

	// delete departent
	@DeleteMapping("/deleteDepartment")
	public ResponseEntity<String> deleteDepartment(@RequestBody Department department) {
		departmentService.deleteDepartment(department);
		return ResponseEntity.ok("deleted Succesfully");

	}

	// update Departmet
	@PutMapping("/updateDepartment")
	public Department updateDepartment(@RequestBody Department department) {
		return departmentService.updateDepartment(department);
	}

	// getAllDepartments
	@GetMapping("/getAllDepartments")
	public Iterable<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	// expand
	@GetMapping("/expandDepartment/{id}")
	public Department expandDepartment(@PathVariable Integer id, @RequestParam String expand) {
		boolean expandEmployee = "employee".equalsIgnoreCase(expand);
		return departmentService.expandDepartment(id, expandEmployee);

	}

}
