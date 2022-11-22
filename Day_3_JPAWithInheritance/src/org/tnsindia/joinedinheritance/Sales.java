package org.tnsindia.joinedinheritance;

import java.io.Serializable;

import javax.persistence.Id;

public class Sales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int sales_id;
	private double price;
	
	//Setter and getter
	
	public int getSales_id() {
		return sales_id;
	}
	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
}
