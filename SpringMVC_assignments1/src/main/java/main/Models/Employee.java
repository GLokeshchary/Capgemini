package main.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
public class Employee {
	@Id
	 String empid;
	 String empname;
	 String empdept; 
	 String empdesignation;
	int salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empid, String empname, String empdept, String empdesignation, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empdesignation = empdesignation;
		this.salary = salary;
	}

	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
