package com.StuMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Employee {

	
	@Id
	private int empId;
	private String empName;
	private String empLocation;
	@OneToMany
	@JoinColumn(name="empId")
	private List<Project> Project;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public List<Project> getProject() {
		return Project;
	}
	public void setProject(List<Project> Project) {
		this.Project = Project;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + ", Project="
				+ Project + "]";
	}
	
	
} 
