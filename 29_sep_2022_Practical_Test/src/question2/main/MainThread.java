package question2.main;

import question2.thread.ThankYouThread;
import question2.thread.WelcomeThread;

public class MainThread {

	public static void main(String[] args) {
		Thread t1=new Thread(new WelcomeThread());
		t1.start();
		
		Thread t2=new Thread(new ThankYouThread());
		t2.start();
	}
}
