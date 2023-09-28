package com.StuMapping;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Team {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure()
        		.addAnnotatedClass(Manager.class).addAnnotatedClass(Laptop.class);
        
        SessionFactory sf=con.buildSessionFactory();
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();

        Laptop l1=new Laptop();
        l1.setLaptopId(10001);
        l1.setLaptopName("Asus tuf gaming");
        
        Laptop l2=new Laptop();
        l2.setLaptopId(10002);
		l2.setLaptopName("MSI");
		
		Laptop l3=new Laptop();
		l3.setLaptopId(10003);
		l3.setLaptopName("Hp OMEN");

		List<Laptop> list1=new ArrayList<>();
		list1.add(l1);
		list1.add(l2);
		

		List<Laptop> list2=new ArrayList<>();
		list2.add(l3);
		list2.add(l2);
		

		List<Laptop> list3=new ArrayList<>();
		list3.add(l3);

		Manager m1=new Manager();
		m1.setManagerId(21);
		m1.setManagerName("Monika");
		m1.setManagerLocation("Delhi");
		m1.setLap(list2);
		
		Manager m2=new Manager();
		m2.setManagerId(22);
		m2.setManagerName("Poonam");
		m2.setManagerLocation("Aurangabad");
		m2.setLap(list1);

		Manager m3=new Manager();
		m3.setManagerId(23);
		m3.setManagerName("Preeti");
		m3.setManagerLocation("Mumbai");
		m3.setLap(list3);
		
		
		ses.save(l1);ses.save(l2);ses.save(l3);
		ses.save(m1);ses.save(m2);ses.save(m3);

        
        Query qu=ses.createQuery("from Manager");
        
        List<Manager> manlist=qu.getResultList();
        
        
        for(Manager m:manlist)
        {

        	List<Laptop> lap=m.getLap();
        	
        	for(Laptop l:lap) {
        		System.out.println(m.getManagerName()+" from "+m.getManagerLocation()+" his using"+l.getLaptopName());
        	}
        }

		tx.commit();

	}
}
