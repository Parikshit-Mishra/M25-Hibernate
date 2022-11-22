package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService;
import org.tnsindia.service.CustomerServiceImpl;

public class ClinetA {

	public static void main(String[] args) {
	
		@SuppressWarnings("unused")
		CustomerService service=new CustomerServiceImpl();
		@SuppressWarnings("unused")
		Customer customer=new Customer();
		@SuppressWarnings("unused")
		Scanner s=new Scanner(System.in);
		
		customer.setCust_ID(3243);
		customer.setName("Parikshit");
		customer.setProduct_price(987.08);
		service.addcustomer(customer);
		System.out.println("Customer added Successfully");
		
		//retreive 
		
		/*customer=service.getCustomerById(1023);
		System.out.println("Customer ID: "+customer.getCust_ID());
		System.out.println("Customer Name: "+customer.getName());
		System.out.println("Customer Product-price: "+customer.getProduct_price());*/

		//updation
		/*System.out.println("Enter the CustID for the updation");
		customer=service.getCustomerById(s.nextInt());
		customer.setName("Rutuja Sonawane");
		service.updateCustomer(customer);
		System.out.println("Customer updated Successfully");*/
		
		//deletion
		System.out.println("Enter the CustID for the deletion");
		customer=service.getCustomerById(s.nextInt());
		service.deleteCustomer(customer);
		System.out.println("Customer deleted Successfully");

	}

}
