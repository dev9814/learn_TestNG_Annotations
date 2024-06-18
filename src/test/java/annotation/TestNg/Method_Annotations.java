package annotation.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Method_Annotations {

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("run before every method");
	}
	
	@Test
	public void m1()
	{
		System.out.println("I am method m1");
	}
	
	@Test
	public void m2()
	{
		System.out.println("I am method m2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("run after every method");
	}
	
}
