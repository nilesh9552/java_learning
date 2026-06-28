package com.HQLCRUD;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

public class HQLcrud {
	
	public static void main(String[] args) {
		
		
		SessionFactory factroy = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(employee.class)
									.buildSessionFactory();
		Session session = factroy.openSession();
		Transaction tx = session.beginTransaction();
		
	Scanner sc = new Scanner(System.in);
//	System.out.print("------------Insert----------");
//		
//	System.out.println("Enter Name");
//	String name = sc.next();
//	
//	System.out.println("Enter City");
//	String city = sc.next();
//	
//	System.out.println("Enter Age");
//	int age = sc.nextInt();
//	
//	
//	
//	employee e1 = new employee();
//	 
//	e1.setName(name);
//	e1.setCity(city);
//	e1.setAge(age);
//	
//	session.persist(e1);
//	System.out.println("Data inserted successfully.");
//	tx.commit();
//	
	
	
	
	System.out.println("Enter Employee ID to Update :");
	int Id = sc.nextInt();

	System.out.println("Enter Name");
	String name = sc.next();
	
	System.out.println("Enyter City");
	String city = sc.next();
	
	System.out.println("Enter age");
	int age = sc.nextInt();
	
	String hql = "update employee set name = :name, city = :city, age = :age where id = :id";
	
	MutationQuery  query = session.createMutationQuery(hql);
	
	query.setParameter("name", name);
	query.setParameter("city", city);
    query.setParameter("age", age);
    query.setParameter("id", Id);
    int result = query.executeUpdate();
    tx.commit();
    System.out.println(result + " record updated successfully.");
    
    
    

    session.close();
   
    sc.close();
	
	}
	
	
	
	
}
