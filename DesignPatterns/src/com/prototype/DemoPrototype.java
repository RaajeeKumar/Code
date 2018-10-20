package com.prototype;

public class DemoPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		
		
		BookShop bs1 = bs.clone();
		bs1.setShopName("A1");
		
		bs.getBooks().remove(2);
		
		System.out.println(bs);
		System.out.println(bs1);

	}

}
