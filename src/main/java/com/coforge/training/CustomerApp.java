package com.coforge.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.training.model.Customer;

//Hibernate Application Using Annotations Configurations
public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
    	Configuration cfg=new Configuration(); // configure hibernate
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session session=sf.openSession(); // physical connection with db is established

    	Transaction t=session.beginTransaction();
    	//object in transient state i.e not associated with any session
    	Customer c1 = new Customer();
    	
    	c1.setFirstName("Rod");
    	c1.setLastName("Jhonson");
    	c1.setBalance(50000);
    	c1.setMarried(false);
    	
    	session.save(c1); // object in persistent state
    	t.commit();
    	System.out.println("Customer Details successfully Saved to DB");
    	session.close(); // object in detached state
    	sf.close();

	}

}
