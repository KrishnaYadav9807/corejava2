package com.sapient.productcatalog;

public class CatalogDesignPattern {
	public static void main(String args[]) {
		CatalogDirectory directory = new CatalogDirectory();
		Department groceries = new Department("1", "Groceries");
		Department furniture = new Department("2", "furniture");
		Department perishables = new Department("7", "Perishables");

		Product bed = new Product("3", "bed", 13000);
		Product almirah = new Product("4", "almirah", 15000);
		Product apple = new Product("5", "apple", 100);
		Product guava = new Product("6", "guava", 200);
		Product cheese = new Product("8", "cheese", 50);
		Product chocolate = new Product("9", "chocolate", 20);

		perishables.addProduct(chocolate);
		perishables.addProduct(cheese);

		groceries.addSubDepartment(perishables);
		groceries.addProduct(apple);
		groceries.addProduct(guava);

		groceries.addSubDepartment(perishables);

		furniture.addProduct(bed);
		furniture.addProduct(almirah);

		directory.addDepartment(groceries);
		directory.addDepartment(furniture);

		directory.showAllProducts();

		directory.addDiscount(5);

		directory.showAllProducts();

	}
}