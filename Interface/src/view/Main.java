package view;
import pack2.Ball;
import pack3.Tyre;
public class Main {

	public static void main(String []args) {
		Ball redBall=new Ball();
		Ball greenBall=new Ball();
		Tyre blackTyre=new Tyre();
		Tyre silverTyre=new Tyre();
		
		redBall.bounce("Red");
		greenBall.bounce("Green");
		blackTyre.bounce("Black");
		silverTyre.bounce("Silver");
		
		
		
	}
}
