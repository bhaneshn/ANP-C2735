package com.anudip.hbce.daoimle;

import java.util.Scanner;

import javax.transaction.Transaction;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.anudip.hbce.dao.CustomerDAO;
import com.anudip.hbce.entity.Customer;
import com.anudip.hbce.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO{

	Scanner scanner=new Scanner(System.in);
	
	public void getCustomer() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter Customer id:");
			int id=scanner.nextInt();
			Customer cust=session.get(Customer.class,id);
			System.out.println("----Customer details are-----");
			System.out.println(cust.getCid()+" "+cust.getCname()+" "+cust.getCemail()+" "+
			cust.getCage()+" "+cust.getCphone());
			
		}catch (HibernateException e) {
		System.out.println(e);
		}
		
	}

	public void addCustomer() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			String cname, cemail;
			int cage;
			long cphone;
			
			System.out.print("Enter Customer Name :");
			cname = scanner.nextLine();
			
			System.out.print("Enter Customer age :");
			cage = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter Customer Email :");
			cemail = scanner.nextLine();
			
			System.out.print("Enter Customer Phone :");
			cphone = scanner.nextInt();
			scanner.nextLine();
			Customer customer = new Customer();
			
			customer.setCname(cname);
			customer.setCemail(cemail);
			customer.setCphone(cphone);
			customer.setCage(cage);
			
			session.save(customer);
			tx.commit();
			System.out.println("*** Added Successfully ***");
			
		
		}catch (HibernateException e) {
		System.err.println(e);
		}
		
	}

	public void updateCustomer() {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			org.hibernate.Transaction t=session.beginTransaction();
			System.out.println("Enter customer Id:");
			int id=scanner.nextInt();
			Customer cust1=session.get(Customer.class, id);
			System.out.println("Enter customer phone");
			long phone=scanner.nextLong();
			cust1.setCphone(phone);
			session.update(cust1);
			t.commit();
			System.out.println("updated successfully");
			
					
		}catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
		
	}

	public void deleteCustomer() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			org.hibernate.Transaction t=session.beginTransaction();
			System.out.println("Enter customer Id:");
			int id=scanner.nextInt();
			Customer cust2=session.get(Customer.class, id);
			session.delete(cust2);
			t.commit();
			System.out.println("deleted successfully");
			
					
		}catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
		
		
	}

}
