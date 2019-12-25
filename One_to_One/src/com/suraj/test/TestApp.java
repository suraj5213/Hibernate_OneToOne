package com.suraj.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suraj.bean.Laptop;
import com.suraj.bean.Student;


public class TestApp {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		Student student = new Student();
		
		Laptop laptop = new Laptop(14,"mac");
		
		student.setRollno(104);
		student.setFirstname("vishal");
		student.setLastname("tayde");
		student.setLaptop(laptop);

		session.save(student);
		session.save(laptop);

		session.getTransaction().commit();

		session.close();

	}

}
