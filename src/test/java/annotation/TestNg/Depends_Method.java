package annotation.TestNg;

import org.testng.annotations.Test;

public class Depends_Method {

	@Test(priority=1)
	public void driverInitialize() 
	{
		System.out.println("initialize the driver");
	}
	
	@Test(dependsOnMethods = "driverInitialize")
	public void enterUrl()
	{
		System.out.println("enter the url to open browser");
	}
	
	@Test(dependsOnMethods = "enterUrl")
	public void enterCredential()
	{
		System.out.println("enter the valid credentils");
	}
	
	@Test(dependsOnMethods = "enterCredential")
	public void driverClosing()
	{
		System.out.println("close the driver");
	}
}
