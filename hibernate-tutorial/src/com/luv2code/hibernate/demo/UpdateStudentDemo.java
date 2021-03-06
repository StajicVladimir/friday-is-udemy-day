package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			int studentId = 1;
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Get complete: " + myStudent);
			
			
			System.out.println("Updating student!");
			myStudent.setFirstName("Vladimir");
			
			session.getTransaction().commit();
			
			
			System.out.println("Updating emails for all students!");
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("UPDATE Student SET email='foo@gmail.com'")
				.executeUpdate();
			
			session.getTransaction().commit();
			System.out.println("Done!");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
