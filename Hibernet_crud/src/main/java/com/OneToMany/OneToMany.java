package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().
			configure("hibernate.cfg.xml")
			.addAnnotatedClass(Department.class)
			.addAnnotatedClass(Employe.class)
			.buildSessionFactory();
			
		Session	 session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		
		Department d1 = new Department();
		d1.setID(101);
		d1.setDepartmentName("IT");
		
		
		Employe e1 = new Employe();
		
		e1.setEmpId(1);
		e1.setName("Nilesh");
		e1.setSalary(250000);
		e1.setCity("Pune");
		

		Employe e2 = new Employe();
		
		e2.setEmpId(2);
		e2.setName("Rahul");
		e2.setSalary(300000);
		e2.setCity("Solapur");
		

		Employe e3 = new Employe();
		
		e3.setEmpId(3);
		e3.setName("Karan");
		e3.setSalary(500000);
		e3.setCity("Haidrabad");
		
		List<Employe> elist = new ArrayList<Employe>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		
		
		d1.setEmployes(elist);
		
		
		
		for(Employe e4:elist) {
			System.out.println(e4);
		}
		
		session.persist(d1);
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		tx.commit();
	
		
		
	}
}
