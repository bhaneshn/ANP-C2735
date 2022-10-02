
public class P34 implements Runnable {

	int k = 0;

	public P34(int i) {

	this.k = i;

	}

	public static void main(String[] args)

	{

	new P34(2).run();

	new P34(1).run();

	}

	public void run() {

	for(int i=0; i<k; i++) {

	System.out.println("run() method...");

	}

	}
}
