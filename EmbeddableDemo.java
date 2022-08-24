package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {
	public static void main(String args [])
	{
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	Student st1 = new Student();
    	st1.setName("Tauqir");
		st1.setPhNo("7364909173");
		
		Student st2 = new Student();
		st2.setName("Joydeep");
		st2.setPhNo("887415932");
		
		Student st3 = new Student();
		st3.setName("Nikhil");
		st3.setPhNo("897456218");
		
		Certificate ct1 = new Certificate();
		ct1.setCourse("Java Full STack");
		ct1.setDuration("6 month");
		
		Certificate ct2 = new Certificate();
		ct2.setCourse("Java Full STack");
		ct2.setDuration("6 month");
		
		Certificate ct3 = new Certificate();
		ct3.setCourse("Java Full STack");
		ct3.setDuration("6 month");
		
		st1.setCertificate(ct1);
		st2.setCertificate(ct2);
		st3.setCertificate(ct3);
		
		session.save(st1);
		session.save(st2);
		session.save(st3);
		
		tx.commit();
		
	}
	

}
