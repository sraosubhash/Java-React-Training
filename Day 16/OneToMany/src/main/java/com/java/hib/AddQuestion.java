package com.java.hib;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AddQuestion {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Question question1 = new Question();
		question1.setQname("What is Java");
		
		Question question2 = new Question();
		question2.setQname("What is OOPS");
		
		Answer ans1 = new Answer();
		ans1.setAnswername("Java is Programming language");
		ans1.setPostedBy("Manipal");
		
		Answer ans2 = new Answer();
		ans2.setAnswername("Java is platform indipendent");
		ans2.setPostedBy("Anoop");
		
		Answer ans3 = new Answer();
		ans3.setAnswername("Abstraction");
		ans3.setPostedBy("Nitisha");
		
		Answer ans4 = new Answer();
		ans4.setAnswername("Encapsulation");
		ans4.setPostedBy("Harshith");
		
		ArrayList<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
		ArrayList<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		question1.setAnswers(list1);
		question2.setAnswers(list2);
		
		Transaction trans = session.beginTransaction();
		session.save(question1);
		session.save(question2);
		trans.commit();
		System.out.println("Data Saved ");
	}
		
	
}
