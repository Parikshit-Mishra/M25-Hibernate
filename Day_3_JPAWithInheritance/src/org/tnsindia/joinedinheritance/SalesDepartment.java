package org.tnsindia.joinedinheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SalesDept")
public class SalesDepartment extends Sales{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int dept_id;
	private String dept_name;
	
	//Setter and getter
	
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	

}
