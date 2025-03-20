package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class AddStudentMain {
	
	public static void main(String[] args) {
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Student student = new Student();
		student.setSname("Sonia");
		student.setCity("Sangli");
		student.setCgpa(9.45);
		
		Address address1 = new Address();
		address1.setAddress1("420");
		address1.setAddress2("chintamaniNagar");
		address1.setCity("Sangli");
		address1.setZipcode("416416");
		address1.setStudent(student);
		
		Transaction trans = session.beginTransaction();
		session.save(address1);
		trans.commit();
		System.out.println("Table created... Data Saved");
	}
}
