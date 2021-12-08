package com.coforge.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.model.Student;

public class StudentApp {

	public static void main(String[] args) {
		
		int cnt=0;
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession();

    	Transaction t=session.beginTransaction();
    	Student s1 = new Student();
    	
    	s1.setRollNo(11);
    	s1.setName("Ashish");
    	s1.setBranch("IT");
    	s1.setPercentage(85);
    	
    	session.save(s1); // object in persistent state
    	t.commit();
    	System.out.println("Product Details successfully Saved to DB");
    	session.close(); // object in detached state
    	sf.close();
	}

}
