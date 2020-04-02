package com.decorator.pizza;

public class Peppers extends ToppingsDecorator
{
	Pizza pizza;
	
	public Peppers(Pizza pizza)
	{
		this.pizza = pizza;
	}

	@Override
	public String getDescription()
	{
		return pizza.getDescription() + ", Peppers";
	}

	@Override
	public double cost()
	{
		return 30+pizza.cost();
	}

}
