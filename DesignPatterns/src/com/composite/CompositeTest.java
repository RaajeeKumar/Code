package com.composite;





public class CompositeTest {

	public static void main(String[] args) {
		Component hd = new leaf(4000, "HDD");
		Component mb = new leaf(8000, "MB");
		Component mouse = new leaf(400, "mouse");
		Component kb = new leaf(1000, "kb");
		
		composite cabinet = new composite("cabinet");
		composite peri = new composite("peri");
		composite computer = new composite("computer");
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		peri.addComponent(mouse);
		peri.addComponent(kb);
		
		computer.addComponent(cabinet);
		computer.addComponent(peri);
		
		computer.showPrice();

	}

}
