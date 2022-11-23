package org.tnsindia.onetooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//Create Student
		
		Student s =new Student();
		s.setID(100);
		s.setNAME("Rutuja");
		
		Student s1 =new Student();
		s1.setID(101);
		s1.setNAME("Parikshit");
		
		//Create Address
		
		Address a=new Address();
		a.setStreetNo(122);
		a.setArea("MG Road");
		a.setCity("Pune");
		
		Address a1=new Address();
		a1.setStreetNo(115);
		a1.setArea("Viman Nagar");
		a1.setCity("Pune");
		
		//inject address into student1
		s.setAddress(a);
		em.persist(s);
		
		//inject address into student2
		s1.setAddress(a1);
		em.persist(s1);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
	
	}

}
