package com.anudip.hb.lab;

import java.util.Scanner;

import com.anudip.hb.imple.AstronautDAOImplement;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        
        AstronautDAOImplement astronautDI=new AstronautDAOImplement();
        
        char x;
        do {
        System.out.println("--Welcome To the Application---");
        System.err.println("Choose any one ");
        System.out.println("Press 1: Add astronaut");
        System.out.println("Press 2: Read astronaut");
        System.out.println("Press 3: Update astronaut");
        System.out.println("Press 4: Delete astronaut");
        System.out.println("Press 5: Exit");
        int choice=scanner.nextInt();
        
        switch(choice) {
        
        case 1:
        	astronautDI.addAstronaut();
        	break;
        case 2:
        	astronautDI.getAstronaut();
        	break;
        case 3:
        	astronautDI.updateAstronaut();
        	break;
        case 4:
        	astronautDI.deleteAstronaut();
        	break;
        case 5:
        	System.exit(0);
        	
    	default:
    		System.out.println("Something went wrong ! please try again ");
        	}
        
        System.out.println("Do you want to enter details again");
        	x=scanner.next().charAt(0);
       
        }while(x=='Y'|| x=='y');
        System.out.println("Thank you");
    }
}
