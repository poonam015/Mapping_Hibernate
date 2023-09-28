package com.StuMapping;


import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	 Configuration con=new Configuration().configure()
         		.addAnnotatedClass(Student.class).addAnnotatedClass(Bike.class);
         
         SessionFactory sf=con.buildSessionFactory();
         
         Session ses=sf.openSession();
         Transaction tx=ses.beginTransaction();
         
//    	 Bike b1=new Bike();
//    	 b1.setBikeId(12);
//    	 b1.setBikeName("BMW 1250GSA");
//    	 
//    	 Bike b2=new Bike();
//    	 b2.setBikeId(102);
//    	 b2.setBikeName("Toyota Fortuner");
//    	 
//    	 Student s1=new Student();
//	     s1.setStId(102);
//	     s1.setStName("Rahul");
//	     s1.setStClass("MCA");
//	     s1.setBike(b1);
//	     
//	     Student s2=new Student();
//	     s2.setStId(2);
//	     s2.setStName("Parul");
//	     s2.setStClass("BCA");
//	     s2.setBike(b2);
//	     
//	     ses.save(b1);
//	     ses.save(b2);
//		 ses.save(s1);
//		 ses.save(s2);
	     
         Query qu=ses.createQuery("from Student");
         
         List<Student> ls=qu.getResultList();
         for(Student s:ls)
         		System.out.println(s.getStName()+" has "+s.getBike().getBikeName());  
	     
         tx.commit();   
    }
}
