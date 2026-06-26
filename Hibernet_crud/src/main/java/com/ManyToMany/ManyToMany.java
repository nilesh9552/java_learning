package com.ManyToMany;



import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ManyToMany {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(StudentM.class).
				addAnnotatedClass(Cources.class).
				buildSessionFactory();
		
		Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 StudentM s1 = new StudentM();
			s1.setName("Join");
			
			StudentM s2 = new StudentM();
			s2.setName("Rahul");
			
			StudentM s3 = new StudentM();
			s3.setName("Karan");
			
			Cources c1 = new Cources();
			c1.setCourceName("HTML");


			Cources c2 = new Cources();
			c2.setCourceName("JAVA");

			Cources c3 = new Cources();
			c3.setCourceName("Python");
			
		s1.setList(Arrays.asList(c1,c2,c3));
		s2.setList(Arrays.asList(c1,c2,c3));
		s3.setList(Arrays.asList(c1,c2,c3));
		
		session.persist(c1);
		session.persist(c2);
		session.persist(c3);

		session.persist(s1);
		session.persist(s2);
		session.persist(s3);

		tx.commit();

		System.out.println("Data Inserted Successfully");

		session.close();
		factory.close();
		
}
}



