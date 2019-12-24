package com.sapient.productcatalog;

import java.util.ArrayList;

class Department implements Catalog {
	private ArrayList<Catalog> subCatalogList = new ArrayList<Catalog>();
	private String departmentId;
	private String departmentName;

	public Department(String departmentId, String departmentName) {
		this.departmentName = departmentName;
		this.departmentId = departmentId;
	}

	public void addProduct(Catalog catalog) {
		subCatalogList.add(catalog);
	}

	public void addSubDepartment(Catalog catalog) {
		subCatalogList.add(catalog);
	}

	@Override
	public void addDiscount(double discountPercent) {
		for (Catalog subCatalog : subCatalogList) {
			subCatalog.addDiscount(discountPercent);
		}
	}

	@Override
	public void showAllProducts() {
		for (Catalog subCatalog : subCatalogList) {
			subCatalog.showAllProducts();
		}
	}
}
