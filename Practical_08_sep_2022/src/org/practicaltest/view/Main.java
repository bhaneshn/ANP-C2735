package org.practicaltest.view;

import org.practicaltest.model.QuestionAnswer;

public class Main {

	
	
	public static void displayQuestion(QuestionAnswer[] questionAnswer ){
	
		for(int i=0;i<questionAnswer.length;i++) {
			if(questionAnswer[i]==null) {
				break;
			
		}else {
			System.out.println("que "+(i+1)+": "+questionAnswer[i].getQuestion());
		
			System.out.println(questionAnswer[i].getOption1());
			System.out.println();
			System.out.println(questionAnswer[i].getOption2());
			System.out.println();
			System.out.println(questionAnswer[i].getOption3());
			System.out.println();
			System.out.println(questionAnswer[i].getOption4());
			System.out.println();
//			System.out.println("Answer "+" :--> "+questionAnswer[i].getAnswer());
//			System.out.println();
		}
		}
	}
	
	public static void main(String[] args) {
		
			  QuestionAnswer[] questionAnswerArray= new QuestionAnswer[100];
			  QuestionAnswer questionAnswer1 = new QuestionAnswer("What is the capital of our India ?","Nagpur","Delhi","Hyderabad","Bhopal","Delhi");
			  QuestionAnswer questionAnswer2 =new QuestionAnswer("Who is the Prime Minster Of our India ?","Yogi","Kejriwal","N Modi","both a & b","N Modi");
			  QuestionAnswer questionAnswer3 =new QuestionAnswer("Who is the former PM of India ?","Modi","yogi","kejriwal","Manmohan Singh","Manmohan Singh");
			  QuestionAnswer questionAnswer4 =new QuestionAnswer("Who is the  CM of Maharshtra ?","Eknath Shinde","yogi","Thakre","Vijay Singh","Eknath Shinde");
			  questionAnswerArray[0]=questionAnswer1;
			  questionAnswerArray[1]=questionAnswer2;
			  questionAnswerArray[2]=questionAnswer3;
			  questionAnswerArray[3]=questionAnswer4;
			  
			  displayQuestion(questionAnswerArray);
			}

}
