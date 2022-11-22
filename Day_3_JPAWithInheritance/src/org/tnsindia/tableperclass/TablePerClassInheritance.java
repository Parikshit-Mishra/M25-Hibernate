package org.tnsindia.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassInheritance {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//create a vehicle
		
		Vehicle v=new Vehicle();
		v.setVehical_no(123);
		v.setVehical_name("BMW");
		v.setVehical_type("Four wheeler");
		em.persist(v);
		
		Vehicle v1=new Vehicle();
		v1.setVehical_no(9999);
		v1.setVehical_name("Maruti");
		v1.setVehical_type("Four wheeler");
		em.persist(v1);
		
		// Create Car
		
		Car c=new Car();
		c.setVehical_no(4444);
		c.setVehical_name("Tiago");
		c.setVehical_type("Four wheeler");
		c.setPrice(2345678);
		em.persist(c);
		
		Car c1=new Car();
		c1.setVehical_no(4231);
		c1.setVehical_name("Nano");
		c1.setVehical_type("Four wheeler");
		c1.setPrice(234500);
		em.persist(c1);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
		
	}
	
}
