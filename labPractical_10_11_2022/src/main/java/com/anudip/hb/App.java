package com.anudip.hb;

import com.anudip.hb.daoimpl.DoctorDAOImpl;


public class App 
{
    public static void main( String[] args )
    {

    DoctorDAOImpl daoImpl=new DoctorDAOImpl();
//    daoImpl.add();
    daoImpl.read();
    }
}
