import java.util.concurrent.Callable;

public class DisplayTask implements Callable<String> {

	public String call() throws RuntimeException{
		return "Display task method";
	}

	

}
