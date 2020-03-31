package com.phoneCameras;

public abstract class phoneCamera
{
	ShareBehavior shareBehavior;
	
	public void setShareBehavior(ShareBehavior shareBehavior)
	{
		this.shareBehavior = shareBehavior;
	}

	public void take()
	{
		System.out.println("picture taken");
	}
	
	public void save()
	{
		System.out.println("picture saved");
	}
	
	public abstract void edit();
	
	public void performShare()
	{
		shareBehavior.share();
	}

}
