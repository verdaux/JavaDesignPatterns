package com.decorator.pizza;

public class ThickCrustPizza extends Pizza
{
	public ThickCrustPizza()
	{
		description = "Thick crusted pizza";
	}

	@Override
	public double cost()
	{
		return 200;
	}

}
