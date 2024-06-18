package annotation.TestNg;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=1)
	public void driverInitialize()
	{
		System.out.println("initialize the driver");
	}
	
	@Test(priority=2)
	public void enterUrl()
	{
		System.out.println("enter the url to open browser");
	}
	
	@Test(priority=3)
	public void enterCredential()
	{
		System.out.println("enter the credentials");
	}
	
	@Test(priority=4)
	public void driverClosing()
	{
		System.out.println("close the driver");
	}
	
}
