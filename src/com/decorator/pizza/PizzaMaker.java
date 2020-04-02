package com.decorator.pizza;

public class PizzaMaker
{

	public static void main(String[] args)
	{
		Pizza thinPizza = new ThinCrustPizza();
		thinPizza = new Cheese(thinPizza);
		thinPizza = new Olives(thinPizza);
		System.out.println(thinPizza.getDescription()+" total bill :: "+thinPizza.cost());
	}

}
