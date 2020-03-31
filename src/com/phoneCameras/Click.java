package com.phoneCameras;

public class Click
{

	public static void main(String[] args)
	{
		IPhoneCamera ip = new IPhoneCamera();
		ip.take();
		ip.edit();
		ip.save();
		ip.setShareBehavior(new SharedViaIphone());
		ip.performShare();
		
	}

}
