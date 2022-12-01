package com.anudip.hb.onetomany.daoimpl;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.hb.onetomany.config.HibernateUtil;
import com.anudip.hb.onetomany.dao.TrainerDAO;
import com.anudip.hb.onetomany.entity.Learner;
import com.anudip.hb.onetomany.entity.Trainer;


public class TrainerDAOImpl implements TrainerDAO{



	public void addTrainer() {
		
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			
			
//			Learner le1=new Learner();
//			
//			Learner le2=new Learner();
//			
//			
//			
//			le1.setSId(01);
//			le1.setSName("Bhanesh");
//			le1.setSAddress("Tukum,Chandrapur");
//			le1.setSPhone("5621562");
//			
//			le2.setSId(02);
//			le2.setSName("Rahul");
//			le2.setSAddress("pune,Chandrapur");
//			le2.setSPhone("56200562");
			
			
			Learner le3=new Learner();
			
			
			
			le3.setSId(03);
			le3.setSName("Om");
			le3.setSAddress("Chandrapur");
			le3.setSPhone("562156256");
			
			List<Learner> list=new ArrayList<Learner>();
//			list.add(le1);
			list.add(le3);
			
//			Trainer trainer=new Trainer();
//			
//			trainer.setTId(101);
//			trainer.setTName("Mamta");
//			trainer.setTEmail("mam@gmail.com");
//			trainer.setTSubject("Java");
//			trainer.setTBatchCode("ANPC-2375");
			
			Trainer trainer2=new Trainer();
			
			trainer2.setTId(102);
			trainer2.setTName("Kalai");
			trainer2.setTEmail("kalai@gmail.com");
			trainer2.setTSubject("Core Java");
			trainer2.setTBatchCode("ANPC-2375");
			
//			trainer.setLearner(list);
			trainer2.setLearner(list);
//			le3.setTrainer(trainer2);
			session.save(trainer2);
			
			transaction.commit();
			
			System.out.println();
			System.out.println("Done");
			
		} catch (HibernateException e) {
			System.out.println(e);
		}
		
	}

	@SuppressWarnings("unchecked")
	public void fetchTrainer() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			TypedQuery<Trainer> empQuery=session.createQuery("from Trainer");
			
			List<Trainer> list1=empQuery.getResultList(); 
			Iterator<Trainer> iterator1=list1.iterator();
			
			while(iterator1.hasNext()) {
				Trainer trainer=iterator1.next();
				System.out.println("Trainers are : "+trainer.getTBatchCode()+" "+trainer.getTName());
				
//				Again printing all learners
				
				List<Learner> list2=trainer.getLearner();
				Iterator<Learner> iterator2=list2.iterator();
				
				while(iterator2.hasNext()) {
					Learner learner=iterator2.next();
					System.out.println(learner.getSName()+" "+learner.getSAddress());
				}
				
			}
			
		} catch (HibernateException e) {
			System.out.println(e);
		}
		
	}

}
