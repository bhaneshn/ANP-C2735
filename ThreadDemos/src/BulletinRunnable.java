
public class BulletinRunnable implements Runnable{
	static Bulletin bulletin=new Bulletin();
	
	String bulletinArray[];
	
	public BulletinRunnable(String textArray[]) {
		bulletinArray=textArray;
	}
	public void run() {
		bulletin.postBulletin(bulletinArray);
	}

}
