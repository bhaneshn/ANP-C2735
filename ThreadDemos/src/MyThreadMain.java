
public class MyThreadMain {

	public static void main(String[] args) throws Exception {
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		MyThread mt3=new MyThread();
		System.out.println(Thread.currentThread().getName());
		System.out.println();
		mt1.start();
		mt2.start();
		mt3.start();
		Thread.currentThread().join();
		System.out.println("Main Methods end");

	}

}
