package question3.main;

public class Main {

	public static void main(String[] args) {
		Runnable lambdaThread=()->{
			System.out.println(Thread.currentThread().getName()+"Welcome to the Lambda Expression Thread");
		};new Thread(lambdaThread).start();

	}

}
