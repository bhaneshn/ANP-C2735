package org.practice;

public class FibonocciSeries {

	public static void main(String[] args) {
		
		int firstTerm=0;
		int secondTerm=1;
		
		for(int i=1;i<=10;++i) {
			System.out.println(firstTerm+" ,");
			
			int nextTerm1=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm1;
		}
		
		
		

	}

}
