package Hibernet_crud.Hibernet_crud;

import java.awt.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new  Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        student s = new student();
        s.setName("Nilesh");
        s.setEmail("Nilesh@gmail.com");
        s.setCity("Pune");
        s.setAge(22);
        
        
        student s1 = new student();
        s1.setName("Join");
        s1.setEmail("join@gmail.com");
        s1.setCity("Solapur");
        s1.setAge(25);
        
        
//        session.persist(s);
//        session.persist(s1);
        
////        // read data
//        student s2 = session.get(student.class, 1);
//        System.out.println("Student id "+ s2.getId());
//        System.out.println("student name "+ s2.getName());
//        System.out.println("student email" + s2.getEmail());
//        System.out.println("Student city "+s2.getCity());
//        System.out.println("Student age"+ s2.getAge());
        
        student s3 = session.get(student.class, 2);
        System.out.println("Student id "+ s3.getId());
        System.out.println("student name "+ s3.getName());
        System.out.println("student email" + s3.getEmail());
        System.out.println("Student city "+s3.getCity());
        System.out.println("Student age"+ s3.getAge());
      
        
        //update Data
//        student s4 = session.get(student.class, 2);
//        s4.setName("Rahul");
//        s4.setEmail("rahul@gmail.com");
//        s4.setCity("Dhule");
//        s4.setAge(20);
        
        //delete data
//        
//        student s5 = session.get(student.class ,1 );
//        session.remove(s5);

        
        // get all data
        
        java.util.List<student> s6 = session.createQuery("from student",student.class).list();
        for(student s7:s6) {
        	System.out.println("ID is :" + s7.getId());
        	System.out.println("Name is :" + s7.getName());
        	System.out.println("Email is :" + s7.getEmail());
        	System.out.println("city is :" + s7.getCity());
        	System.out.println("Age is :" + s7.getAge());
        	  System.out.println("+++++++++++++++");
        }
        
        
        
        
        tx.commit();
        session.close();
    }
}
