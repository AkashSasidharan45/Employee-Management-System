package com.ty.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deptId;
	private String deptName;
	private LocalDate creationDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_head_id")
	@JsonIgnoreProperties("department")
	private Employee deptHead;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("department")
	private List<Employee> employee;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public Employee getDeptHead() {
		return deptHead;
	}

	public void setDeptHead(Employee deptHead) {
		this.deptHead = deptHead;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}
