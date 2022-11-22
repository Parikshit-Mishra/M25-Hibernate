package org.tnsindia.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//Create Emp
		
		Employee e=new Employee();
		e.setEmpID(123);
		e.setName("Piya");
		e.setSalary(45678);
		em.persist(e);
		
		Employee e1=new Employee();
		e1.setEmpID(12);
		e1.setName("Jenny");
		e1.setSalary(47000.80);
		em.persist(e1);
		
		//create a manager
		Manager m=new Manager();
		m.setEmpID(13);
		m.setName("Rhea");
		m.setSalary(100000.00);
		m.setDeptname("HR");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
	}

}
