package com.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name = "Department_Details")
public class DepartmentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer DeptId;
	private String deptName;
	
	@OneToMany(mappedBy = "department")
	Set<EmployeeEntity> employee;
	
	
	public Set<EmployeeEntity> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<EmployeeEntity> employee) {
		this.employee = employee;
	}
	public Integer getDeptId() {
		return DeptId;
	}
	public void setDeptId(Integer deptId) {
		DeptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

	
}
