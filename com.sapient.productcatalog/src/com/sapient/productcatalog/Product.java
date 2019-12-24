package com.sapient.productcatalog;
class Product implements Catalog {
	private String prodId;
	private String prodName;
	private double price;

	public Product(String prodId, String prodName, double price){
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}

	@Override
	public void addDiscount(double discountPercent){
		price = price - ((discountPercent*price)/100);
	}

	@Override
	public void showAllProducts(){
		System.out.println( "\n\n Product id: " + prodId + " " + "prodName: " + 
								prodName + " price : " + price + "\n\n");
	}
}