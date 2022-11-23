package org.tnsindia.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//Create Depart
		
		Department deparment=new Department();
		deparment.setId(4567);
		deparment.setName("HR");
		
		Department deparment1=new Department();
		deparment1.setId(4547);
		deparment1.setName("Marketing");
		
		Department deparment2=new Department();
		deparment2.setId(4500);
		deparment2.setName("Production");
		
		//crete an emp1;
		Employee emp=new Employee();
		emp.setEmp_id(163);
		emp.setEmp_name("Suraj");
		emp.setSalary(50500);
		
		Employee emp1=new Employee();
		emp1.setEmp_id(163);
		emp1.setEmp_name("Parikshit");
		emp1.setSalary(505000);
		
		Employee emp2=new Employee();
		emp2.setEmp_id(163);
		emp2.setEmp_name("Nama");
		emp2.setSalary(5050000);
		
		emp.setDepartment(deparment);
		em.persist(emp);
		
		
		emp1.setDepartment(deparment1);
		em.persist(emp1);
		
		emp2.setDepartment(deparment2);
		em.persist(emp2);
		
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();

		

	}

}
