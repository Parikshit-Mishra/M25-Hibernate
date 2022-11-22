package org.tnsindia.singletable;

import java.io.Serializable;

import javax.persistence.Id;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int EmpID;
	private String Name;
	private double salary;
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
