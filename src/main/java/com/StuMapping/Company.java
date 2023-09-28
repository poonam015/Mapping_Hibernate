package com.StuMapping;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration con=new Configuration().configure()
        		.addAnnotatedClass(Employee.class).addAnnotatedClass(Project.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
        
		Project p1=new Project();
		p1.setProjectId(1);
		p1.setProjectName("Java Banking project");
		
		Project p2=new Project();
		p2.setProjectId(2);
		p2.setProjectName("Angular payment project");
		
		Project p3=new Project();
		p3.setProjectId(3);
		p3.setProjectName("Nodejs Project");
		
		List<Project> projectlist=new ArrayList<Project>();
		
		projectlist.add(p1);
		projectlist.add(p2);
		
		List<Project> projectlist2=new ArrayList<Project>();
		
		projectlist2.add(p3);
		
		Employee e1=new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Poonam");
		e1.setEmpLocation("Aurangabad");
		e1.setProject(projectlist);
		
		
		Employee e2=new Employee();
		e2.setEmpId(102);
		e2.setEmpName("Pallavi");
		e2.setEmpLocation("Mumbai");
		e2.setProject(projectlist2);
		
		ses.save(p1);
		ses.save(p2);
		ses.save(p3);
		ses.save(e1);
		ses.save(e2);
		
        
       Query qu=ses.createQuery("from Employee");
        
        //to get list of employees
        List<Employee> emplist=qu.getResultList();
        
        for(Employee emp:emplist)
        {
        	
        	//to get list of projects of a employee
        	List<Project> pp=emp.getProject();
        	for(Project p:pp)
        	System.out.println(emp.getEmpName()+" is working in "+p.getProjectName());
        	
        }
        
        
        tx.commit();

	}

}
