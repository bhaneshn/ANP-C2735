package example.base;

public class Car {
	String color;
	String body;
	
	public Car(){
		color="Blue";
		body="Audi";
	}
	public Car(String Color,String Body) {
		color=Color;
		body=Body;
	}
	
	
	public void playRadio() {
		System.out.println("Radio is played");
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getColor() {
		return color;
	}

	
	public void setColor(String Color) {
		this.color=Color;
	}
}
