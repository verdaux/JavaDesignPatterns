package com.decorator.pizza;

public class Olives extends ToppingsDecorator
{
	Pizza pizza;
	
	public Olives(Pizza pizza)
	{
		this.pizza = pizza;
	}

	@Override
	public String getDescription()
	{
		return pizza.getDescription() + ", Olives";
	}

	@Override
	public double cost()
	{
		return 20+pizza.cost();
	}

}
