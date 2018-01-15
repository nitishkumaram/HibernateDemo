package com.accenture.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.accenture.pojo.Book;

public class MainCode {

	public static void main(String[] args) {
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Book book = new Book();
		book.setBookName("Hibernate");
		book.setBookPrice(564.34f);
		session.save(book);
		tx.commit();
		System.out.println("Insert Successfull");
	}
}
