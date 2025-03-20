package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class EmployShowMain {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		System.out.println("Connection Sucessfully...");
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> empList = query.list();
		for (Employ e : empList) {
			System.out.println(e);
		}
	}

}
