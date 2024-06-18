package annotation.TestNg;

import org.testng.annotations.Test;

public class Priority_Character {

	@Test(priority='A')
	public void driverInitialize()
	{
		System.out.println("initialize the driver");
	}
	
	@Test(priority='B')
	public void enterUrl()
	{
		System.out.println("enter the url to open browser");
	}
	
	@Test(priority='a')
	public void enterCredential()
	{
		System.out.println("enter the credentials");
	}
	
	@Test(priority='b')
	public void driverClosing()
	{
		System.out.println("close the driver");
	}
	
}


