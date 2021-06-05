package com.synechron.javatraining.finaldemo;

public class FinalDemoManager extends FinalMethodDemo
{

	@Override
	public void testDrive() {
		super.testDrive();
		System.out.println("Test drive completed");
	}
	
	public static void main(String[] args)
	{
		FinalDemoManager fmd = new FinalDemoManager();
		
		fmd.company();
		fmd.maxSpeed();
		fmd.testDrive();
	}
}
