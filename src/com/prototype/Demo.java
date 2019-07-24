package com.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs = new BookShop();
		bs.setShopname("Novilty");
		bs.LoadData();
		System.out.println(bs);
		
		BookShop bs1 = bs.clone();
		bs1.setShopname("A1");
		System.out.println(bs1);
	}
}
