package com.decorator.pizza;

public class ThinCrustPizza extends Pizza
{
	public ThinCrustPizza()
	{
		description = "Thin crusted pizza";
	}

	@Override
	public double cost()
	{
		return 100;
	}

}
