package com.phoneCameras;

public class IPhoneCamera extends phoneCamera
{

	
	
	public IPhoneCamera()
	{
		shareBehavior = new SharedViaIphone();
	}

	@Override
	public void edit()
	{
		System.out.println("add iPhone filters");
	}

}
