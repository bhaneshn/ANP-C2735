
public class Bulletin {

	synchronized void postBulletin(String bulletinArray[]) {
		for(String bullet:bulletinArray) {
			System.out.println(bullet);
		}
		try{
			Thread.sleep(3000);//In 1 minutes have 60000 milliseconds
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
