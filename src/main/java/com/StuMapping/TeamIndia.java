package com.StuMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TeamIndia {

	public static void main(String[] args) {
	
		Configuration con=new Configuration().configure()
        		.addAnnotatedClass(Player.class).addAnnotatedClass(Batters.class).addAnnotatedClass(Bowlers.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session ses=sf.openSession();
        Transaction tx=ses.beginTransaction();
		
		Batters b1=new Batters();
        b1.setPlayerId(1);
        b1.setPlayerName("M S Dhoni");
        b1.setBattingHand("Right hand");
        b1.setHighestScore(183);
        
        Bowlers bo1=new Bowlers();
        bo1.setPlayerId(2);
        bo1.setPlayerName("Zaheer khan");
        bo1.setBowlingHand("Left hand");
        bo1.setBestFigures("8-23");
        
        ses.save(b1);
        ses.save(bo1);
        
        tx.commit();
        

	}

}
