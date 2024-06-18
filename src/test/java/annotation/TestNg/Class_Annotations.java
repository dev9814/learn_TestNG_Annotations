package annotation.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_Annotations {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This method will run before the starting of the class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This method will run after the end of every class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This method will run before every method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This mehtod will run after every method");
	}
	
	@Test
	public void m1()
	{
		System.out.println("this is method m1");
	}
	
	@Test
	public void m2()
	{
		System.out.println("this is method m2");
	}
	
}
