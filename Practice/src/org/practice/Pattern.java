package org.practice;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number: ");
	
	int n=scan.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//	for(int i=1;i<=n;i++) {
//		
//		for(int j=1;j<i;j++) {
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
	
//       for(int i=1;i<=n;i++) {
//		
//		  for(int j=1;j<i;j++) {
//			  
//			System.out.print(i+" ");
//		}
//		System.out.println();
//	}
	int no=0;
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<i;j++) {
			no++;
			System.out.print(no+" ");
		}
		System.out.println();
	}
	
	}
}
