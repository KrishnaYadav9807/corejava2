package com.sapient.productcatalog;

import java.util.ArrayList;

class CatalogDirectory implements Catalog {
	private ArrayList<Catalog> departmentList = new ArrayList<Catalog>();

	public void addDepartment(Catalog department) {
		departmentList.add(department);
	}

	@Override
	public void addDiscount(double discountPercent) {
		for (Catalog subCatalog : departmentList) {
			subCatalog.addDiscount(discountPercent);
		}
	}

	@Override
	public void showAllProducts() {
		for (Catalog subCatalog : departmentList) {
			subCatalog.showAllProducts();
		}
	}
}