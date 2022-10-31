

public class A {
	public static void main(String args[]) {

		Car c1 = new Car("Red", "Maruti", 200);

		Car c2 = new Car("Red", "Maruti", 200);

		if (c1.equals(c2)) {

		System.out.println("The two objects are equal");

		}

		}

		}

		class Car {

		String color;

		String brandName;

		int speed;

		public Car(String color, String brandName, int speed) {

		this.color = color;

		this.brandName = brandName;

		this.speed = speed;

		}

		String getBrandName() {

		return brandName;

		}

		int getSpeed() {

		return speed;

		}

		String getColor() {

		return color;

		}

		public boolean equals(Object obj) {

		if(this == obj) {

		return true;

		}

		if (!(obj instanceof Car)) {

		return false;

		}

		Car Car = (Car)obj;

		return speed == Car.getSpeed() && brandName.equals

		(Car.getBrandName())

		&& color.equals(Car.getColor());

		}

}








