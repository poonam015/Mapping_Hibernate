package com.StuMapping;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Factory {

public static void main(String[] args) {
		
		Configuration con=new Configuration().configure()
        		.addAnnotatedClass(Worker.class).addAnnotatedClass(Location.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
    
        Location loc1=new Location();
        loc1.setLocationId(103);
        loc1.setLocationName("Aurangabad");
        loc1.setLocationState("MH");
        
        Location loc2=new Location();
        loc2.setLocationId(104);
        loc2.setLocationName("Pune");
        loc2.setLocationState("MH");
        
        
        Worker w1=new Worker();
        w1.setWorkerId(4);
        w1.setWorkerName("Poonam");
        w1.setWorkerField("Networking");
        w1.setLoc(loc2);
        
        Worker w2=new Worker();
        w2.setWorkerId(5);
        w2.setWorkerName("Vrushali");
        w2.setWorkerField("Data analysis");
        w2.setLoc(loc2);
        
		ses.save(loc2);
		ses.save(loc1);
        ses.save(w1);
        ses.save(w2);
                
        tx.commit();
        
        Query qu=ses.createQuery("from Worker");
        
        List<Worker> workerlist=qu.getResultList();
        
        for(Worker w:workerlist)
        System.out.println(w.getWorkerName()+" from "+w.getLoc().getLocationName());
}
}
