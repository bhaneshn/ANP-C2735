
public class P26 extends Thread {

		String str = "";

		public P26(String s) {

		this.str = s;

		}

		public void run() {

		if(str.equals("thread1")) {

//		yield();  here the error got in this line

		}

		System.out.println("End of " + str);

		} public static void main(String args []) {

		Thread thread1 = new P26("thread1");

		thread1.setPriority(Thread.MAX_PRIORITY);

		Thread thread2 = new P26("thread2");

		thread2.setPriority(Thread.MIN_PRIORITY);

		thread1.start();
		thread2.start();

		}
}
