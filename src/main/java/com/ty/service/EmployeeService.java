package com.ty.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ty.entity.Department;
import com.ty.entity.Employee;
import com.ty.repository.DepartmentRepository;
import com.ty.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartmentRepository departmentRepository;

	// department id assigning to employee
	public Employee createEmployee(Employee employee) {
		if (employee.getDepartment() != null && employee.getDepartment().getDeptId() != null) {
			Integer deptId = employee.getDepartment().getDeptId();
			Department department = departmentRepository.findById(deptId).orElseThrow();
			employee.setDepartment(department);
		} else {
			throw new IllegalArgumentException(
					"Department ID must be provided to assign a department to the employee.");

		}
		// Assigning Reporting Manager
		if (employee.getEmpReportingManger() != null && employee.getEmpReportingManger().getEmpId() != null) {
			Integer repManagerId = employee.getEmpReportingManger().getEmpId();
			Employee emp = employeeRepository.findById(repManagerId).orElseThrow();
			employee.setEmpReportingManger(emp);
		} else {
			throw new IllegalArgumentException("Reporting Manager ID must be provided.");

		}
		return employeeRepository.save(employee);
	}

	// update Employee
	public Employee updateEmployee(Employee employee) {
		Integer empId = employee.getEmpId();
		Employee employee2 = employeeRepository.findById(empId).orElseThrow();
		if (employee.getEmpName() != null) {
			employee2.setEmpName(employee.getEmpName());
		}
		if (employee.getEmpDOB() != null) {
			employee2.setEmpDOB(employee.getEmpDOB());
		}
		if (employee.getEmpSalary() != null) {
			employee2.setEmpSalary(employee.getEmpSalary());
		}
		if (employee.getEmpAddress() != null) {
			employee2.setEmpAddress(employee.getEmpAddress());
		}
		if (employee.getEmpRole() != null) {
			employee2.setEmpRole(employee.getEmpRole());
		}
		if (employee.getEmpJoiningDate() != null) {
			employee2.setEmpJoiningDate(employee.getEmpJoiningDate());
		}
		if (employee.getEmpYearlyBonus() != null) {
			employee2.setEmpYearlyBonus(employee.getEmpYearlyBonus());
		}

		if (employee.getDepartment() != null && employee.getDepartment().getDeptId() != null) {// changing employee
																								// department
			Integer deptId = employee.getDepartment().getDeptId();
			Department department = departmentRepository.findById(deptId).orElseThrow();
			employee2.setDepartment(department);
		}
		if (employee.getEmpReportingManger() != null && employee.getEmpReportingManger().getEmpId() != null) {

			Employee manager = employeeRepository.findById(employee.getEmpReportingManger().getEmpId()).orElseThrow();
			employee2.setEmpReportingManger(manager);
		}
		return employeeRepository.save(employee2);

	}

//delete employee
	public void deleteEmployee(Employee employee) {
		if (employee != null && employee.getEmpId() != null) {
			Employee existingEmployee = employeeRepository.findById(employee.getEmpId()).orElseThrow();
			employeeRepository.delete(existingEmployee);
		} else {
			throw new IllegalArgumentException("Employee or Employee ID must not be null.");
		}

	}

//get all employee
	public Iterable<Employee> getAllEmployee() {
		try {
			return employeeRepository.findAll();
		} catch (Exception e) {
			throw new RuntimeException("Failed to fetch employee data: " + e.getMessage());
		}

	}

//expand employee
	public Object expandEmployee(Boolean lookup) {
		try {

			Iterable<Employee> employees = employeeRepository.findAll();

			if (Boolean.TRUE.equals(lookup)) {
				List<Map<String, Object>> listOfexpands = new ArrayList<>();

				for (Employee emp : employees) {
					Map<String, Object> expandedEmployee = new HashMap<String, Object>();
					expandedEmployee.put("empId", emp.getEmpId());
					expandedEmployee.put("empName", emp.getEmpName());
					listOfexpands.add(expandedEmployee);
				}
				return listOfexpands;

			}
			return employees;
		} catch (Exception e) {
			throw new RuntimeException("Failed to fetch or expand employees: " + e.getMessage());

		}

	}

}
