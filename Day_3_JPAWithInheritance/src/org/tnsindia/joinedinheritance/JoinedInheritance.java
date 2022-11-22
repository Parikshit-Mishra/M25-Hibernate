package org.tnsindia.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		Sales s= new Sales();
		s.setSales_id(4);
		s.setPrice(5678.77);
		em.persist(s);
		
		Sales s1=new Sales();
		s1.setSales_id(19);
		s1.setPrice(3300.60);
		em.persist(s1);
		
		SalesDepartment d=new SalesDepartment();
		d.setSales_id(31);
		d.setPrice(6345.90);
		d.setDept_id(123);
		d.setDept_name("Cosmetics");
		em.persist(d);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
		

	}

}
