
public class MyThread extends Thread{

	public void run() {
//		for(int i=1;i<=3;i++)
		System.out.println(Thread.currentThread().getName()+" "+"My Thread is Executing");
	}
}
