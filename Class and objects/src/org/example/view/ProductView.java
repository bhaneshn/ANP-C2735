package org.example.view;
import org.example.view.Product;
public class ProductView {

	
	String getproductNamefromProduct(Product prodObj) {
		String prodName=prodObj.getProductName();
		return prodName;
	}
	int doublePrice(int price) {
		
		return price;  
	}
	
	public static void main(String[] args) {
		Product product1=new Product(1,"Mobile");
		ProductView mainView2=new ProductView();
	
		String prodName1=mainView2.getproductNamefromProduct(product1);
		System.out.println("The productName is : "+ prodName1);
		
		Product prodPrice1=new Product(50,"Bhanesh");
		ProductView prod2=new ProductView();
		
		int price=prodPrice1.getProductPrice();
		int price2=prod2.doublePrice(2*price);
		System.out.println("the price original is : "+ price);
		System.out.println("the price after double is : "+ price2);
	}
	
}
