package com.phoneCameras;

public class SharedViaIphone implements ShareBehavior
{

	@Override
	public void share()
	{
		System.out.println("shared via iPhone");
	}

}
