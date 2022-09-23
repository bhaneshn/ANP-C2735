
public class BulletinMain {
public static void main(String[] args) {
	String bulletin1[]= {"BigNews1","BigNews2"};
	String bulletin2[]= {"smallNews1","smallNews2"};
	
	Thread t1=new Thread(new BulletinRunnable(bulletin2),"smallNews");
	Thread t2=new Thread(new BulletinRunnable(bulletin1),"bigNews");
	
	t1.start();
	t2.start();
}
}
