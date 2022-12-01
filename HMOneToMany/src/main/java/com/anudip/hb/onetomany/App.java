package com.anudip.hb.onetomany;

import com.anudip.hb.onetomany.daoimpl.TrainerDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TrainerDAOImpl dao=new TrainerDAOImpl();
//    	dao.addTrainer();
    	
    	dao.fetchTrainer();
    	
    	
    }
}
