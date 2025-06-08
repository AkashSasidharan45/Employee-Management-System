package com.ty.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private LocalDate empDOB;
	private Long empSalary;
	private String empAddress;
	private String empRole;
	private LocalDate empJoiningDate;
	private Double empYearlyBonus;
	@ManyToOne
	@JoinColumn(name = "reporting_manager_id")
	private Employee empReportingManger;
	@ManyToOne()
	@JsonIgnoreProperties({"deptHead","employee"})
	@JoinColumn(name = "department_id")

	private Department department;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}
	public Long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Long empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public LocalDate getEmpJoiningDate() {
		return empJoiningDate;
	}
	public void setEmpJoiningDate(LocalDate empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}
	public Double getEmpYearlyBonus() {
		return empYearlyBonus;
	}
	public void setEmpYearlyBonus(Double empYearlyBonus) {
		this.empYearlyBonus = empYearlyBonus;
	}
	public Employee getEmpReportingManger() {
		return empReportingManger;
	}
	public void setEmpReportingManger(Employee empReportingManger) {
		this.empReportingManger = empReportingManger;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}

	