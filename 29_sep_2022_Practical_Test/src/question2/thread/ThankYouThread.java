package question2.thread;

public class ThankYouThread implements Runnable{

	synchronized public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Thank You my dear thread");
			try {
				Thread.sleep(40000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
