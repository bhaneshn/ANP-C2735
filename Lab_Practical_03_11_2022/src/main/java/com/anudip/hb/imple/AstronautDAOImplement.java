package com.anudip.hb.imple;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.hb.dao.AstronautDAO;
import com.anudip.hb.entity.Astronaut;
import com.anudip.hb.util.HibernateUtil;

public class AstronautDAOImplement implements AstronautDAO {

	Scanner scanner=new Scanner(System.in);
	
	public void getAstronaut() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter Id for Reading the Inputs: ");
			int id=scanner.nextInt();
			System.out.println();
			
			Astronaut astro=session.get(Astronaut.class, id);
			
			System.out.println("----Astronaut details are-----");
			System.out.println();
			
			System.out.println(astro.getId()+" "+astro.getAName()+" "+astro.getAMission()+" "+
			astro.getARocketName()+" "+astro.getAPhone());
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void addAstronaut() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			String aName,aMission,aRocketName;
			long aPhone;
			
			
			System.out.println("Enter name:");
			aName=scanner.next();
			
			System.out.println("Enter mission name: ");
			aMission=scanner.next();
			scanner.nextLine();
			System.out.println("Enter Rocket name: ");
			aRocketName=scanner.next();
			
			System.out.println("Enter Phone Number: ");
			aPhone=scanner.nextLong();
			scanner.nextLine();
			
			Astronaut astro=new Astronaut();
			
			astro.setAName(aName);
			astro.setAMission(aMission);
			astro.setARocketName(aRocketName);
			astro.setAPhone(aPhone);
			
			session.save(astro);
			transaction.commit();
			System.out.println("*** Added Successfully ***");
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateAstronaut() {
		
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			
			System.out.println("Enter Astronaut Id: ");
			int id=scanner.nextInt();
			Astronaut ast1=session.get(Astronaut.class, id);
			System.out.println("Enter Astronaut Name: ");
			String name=scanner.nextLine();
			
			ast1.setAName(name);
			session.update(ast1);
			transaction.commit();
			System.out.println("updated successfully");
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void deleteAstronaut() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			
			System.out.println("Enter Astronaut Id: ");
			int id=scanner.nextInt();
			Astronaut ast2=session.get(Astronaut.class, id);
			
			session.delete(ast2);
			transaction.commit();
			System.out.println("Deleted successfully");
		
	}catch(HibernateException e) {
		e.printStackTrace();
	}
	}
}
