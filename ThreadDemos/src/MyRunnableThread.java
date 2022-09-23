
public class MyRunnableThread implements Runnable{

	public void run() {
		for(int i=1;i<5;i++) {
			Thread t=Thread.currentThread();
			
		//Thread.currentThread().getName();
			
		System.out.println(t.getName()+" "+" My Runnable Thread "+" "+i);
	}
	}
}
