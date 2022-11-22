package org.tnsindia.tableperclass;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Vehical")
public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int vehical_no;
	private String vehical_name;
	private String vehical_type;
	public int getVehical_no() {
		return vehical_no;
	}
	public void setVehical_no(int vehical_no) {
		this.vehical_no = vehical_no;
	}
	public String getVehical_name() {
		return vehical_name;
	}
	public void setVehical_name(String vehical_name) {
		this.vehical_name = vehical_name;
	}
	public String getVehical_type() {
		return vehical_type;
	}
	public void setVehical_type(String vehical_type) {
		this.vehical_type = vehical_type;
	}
	
	
}
