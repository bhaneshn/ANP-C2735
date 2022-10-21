package org.test.read;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	  
	public static void main(String[] args)
    {
 
    	
    	Scanner sc = new Scanner(System.in);
       System.out.println("enter the text write in file");
        String text = sc.nextLine();
        
        try {
 
            BufferedWriter writer
                = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\Desktop\\JAVA\\New folder\\Diwali.txt"));
 
            writer.write(text);
 
            System.out.print(text);
 
            System.out.print("File is created successfully with the content.");
 
            writer.close();
        }
        catch (IOException e) {
 
            System.out.print(e.getMessage());
        }
    }
	
}
