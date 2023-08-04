package TestNG;

import org.testng.annotations.Test;

public class testNG
{

	@Test
	public void test1() 
	{
		System.out.println("Hi Test1");
	}
	
	@Test
	public void test2(enabled=false)
	{
		System.out.println("Hi Test2");
	}
	@Test
	public void test3(priority=-1,invoactionCount=2) 
	{
		System.out.println("Hi Test3");
	}
	
}
