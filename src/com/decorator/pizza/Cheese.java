package com.decorator.pizza;

public class Cheese extends ToppingsDecorator
{
	Pizza pizza;
	
	public Cheese(Pizza pizza)
	{
		this.pizza = pizza;
	}

	public String getDescription()
	{
		return pizza.getDescription() + ", Cheese";
	}

	@Override
	public double cost()
	{
		return 50+pizza.cost();
	}

}
