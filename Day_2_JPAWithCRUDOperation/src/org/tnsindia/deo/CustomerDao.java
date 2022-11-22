package org.tnsindia.deo;

import org.tnsindia.entities.Customer;

public interface CustomerDao {

	//abstract method for crud-operation
	//User-defined method
		void addCustomer(Customer customer);
		void updateCustomer(Customer customer);
		void deleteCustomer(Customer customer);
		Customer getCustomerById(int cust_ID);
		void commitTransaction();
		void beginTransaction();
}
