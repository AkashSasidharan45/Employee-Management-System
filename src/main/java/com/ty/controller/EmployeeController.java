package com.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.entity.Employee;
import com.ty.repository.EmployeeRepository;
import com.ty.service.DepartmentService;
import com.ty.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private final EmployeeRepository employeeRepository;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	DepartmentService departmentService;

	EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	// create employee
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);

	}

	// update employee
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	// delete employee
	@DeleteMapping("/deleteEmployee")
	public ResponseEntity<String> deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
		return ResponseEntity.ok("Employee deleted Successfully!");

	}

	// get All Employee
	@GetMapping("/getAllEmployee")
	public Iterable<Employee> getAllEmployees() {
		return employeeService.getAllEmployee();

	}

	// get EmployeeDetails
	@GetMapping("/expandEmployee")
	public Object expandEmployee(@RequestParam Boolean lookup) {

		return employeeService.expandEmployee(lookup);

	}

}
