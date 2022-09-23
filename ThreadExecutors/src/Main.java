import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
public static void main(String[] args) {
//	Executor executor=Executors.newSingleThreadExecutor();
//	Executor executor=Executors.newFixedThreadPool(2);
//	Executor executor=Executors.newCachedThreadPool();
	Executor executor=Executors.newScheduledThreadPool(2);
	executor.execute(new CopyTask());
	executor.execute(new SpellCheck());
	ExecutorService es=Executors.newCachedThreadPool();
	Future<String> fObj=es.submit(new DisplayTask());
	try {
		System.out.println(fObj.get());
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
