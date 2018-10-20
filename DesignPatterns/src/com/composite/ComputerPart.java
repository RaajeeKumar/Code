package com.composite;

import java.util.ArrayList;
import java.util.List;

interface Component
{
	void showPrice();
}


class leaf implements Component{
	
	int price;
	String name;
	
	public leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() 
	{
		System.out.println(name + ":" + price);
		
	}

}

class composite implements Component{
	
	String name;
	
	public composite(String name) {
		super();
		this.name = name;
	}

	List<Component> components = new ArrayList<>();
	
	public void addComponent(Component comp)
	{
		components.add(comp);
	}

	@Override
	public void showPrice() 
	{
		System.out.println(name);
		for(Component c : components)
		{
			c.showPrice();
		}
		
	}
	
}
