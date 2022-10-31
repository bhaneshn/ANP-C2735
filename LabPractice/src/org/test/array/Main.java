package org.test.array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Target");
		int target=scanner.nextInt();
		
		System.out.println();
		
		System.out.println("Enter the size of array");
		int size=scanner.nextInt();
		
		System.out.println();
		
		int array[]=new int[size];
		
		System.out.println("Enter Elements");
		
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				
				if(array[i]+array[j]==target) {
					System.out.println();
					System.out.println("Indices are : ");
					System.out.println(i + " " + j);
				}
			}
		}

	}

}
