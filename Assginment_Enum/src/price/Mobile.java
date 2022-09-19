package price;

public enum Mobile {
SAMSUNG(20000),LENOVO(10000),IPHONE(50000);
	int price;
	
	Mobile (int price){
		this.price=price;
	}
	int printPrice() {
		return price;
	}
}
