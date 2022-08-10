package org.example.view;

public class Product {
		private int productPrice;
		private String productName;
		public Product(){
			
		}

		public Product(int productPrice , String productName) {
			this.productPrice=productPrice;
			this.productName=productName;
		}
		public int getProductPrice() {
			return productPrice;
		}
		
		public void setProductPrice(int productPrice) {
			this.productPrice=productPrice;
		}
		
		public String getProductName() {
			return productName;
			
		}
		public void setProductName(String productName) {
			this.productName=productName;
		}
}
