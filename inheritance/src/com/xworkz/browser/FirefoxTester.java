package com.xworkz.browser;

public class FirefoxTester {
	public static void main(String []args) {
	Object object = new Firefox();
	Browser browser=new Firefox();
	if(object instanceof Firefox)
	{
		System.out.println("yes it is Firefox");
	}else
	{
		System.out.println("its not instance Firefox");
	}
	object=new String("test");
	if(object instanceof Firefox)
	{
		System.out.println("yes it is firefox");
	}else
	{
		System.out.println("its not a instance of Firefox");

	}
}
}
