package question2.thread;

public class WelcomeThread implements Runnable{

	synchronized public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Welcome my dear thread");
			try {
				Thread.sleep(20000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
