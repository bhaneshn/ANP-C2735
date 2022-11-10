package com.anudip.hb.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.hb.config.HibernateUtil;
import com.anudip.hb.dao.DoctorDAO;
import com.anudip.hb.entity.Courses;
import com.anudip.hb.entity.Doctor;

public class DoctorDAOImpl implements DoctorDAO{

	public void add() {
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Doctor doc=new Doctor();
			
			doc.setId(01);
			doc.setName("DR.Mayank");
			doc.setAddress("maha");
			doc.setEmail("mayank@gmail.com");
			doc.setPhone("4561661545");
			
			Courses cou=new Courses();
			
			cou.setCoursesDone(1);
			cou.setCoursesName("MBBS");
			cou.setCoursesUniversity("Shivaji University");
			cou.setCoursesCollege("Sant tukaram");
			
			doc.setCourses(cou);
			session.save(doc);
			transaction.commit();
			System.out.println();
			System.out.println("-----Done----");
			
		} catch (HibernateException e) {
		System.out.println(e);
		}
		
	}

	@SuppressWarnings("unchecked")
	public void read() {
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
		
			TypedQuery<Doctor> docQuery=session.createQuery("from Doctor");
			
			List<Doctor> list=docQuery.getResultList();
			
			Iterator<Doctor> iterator=list.iterator();
			while(iterator.hasNext()) {
				Doctor doctor=iterator.next();
				System.out.println(doctor.getName()+" "+doctor.getPhone()+" "+doctor.getEmail());
				
				Courses courses=doctor.getCourses();
				System.out.println(courses.getCoursesName()+" "+courses.getCoursesCollege());
			}
			
			
			
		} catch (HibernateException e) {
			System.out.println(e);
		}
		
	}

}
