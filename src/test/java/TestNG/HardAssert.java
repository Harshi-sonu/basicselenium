package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert 
{
	@BeforeMethod
	public void openApp() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Login() {
		By driver;
		driver.findElement((SearchContext) By.id("email")).sendKeys("HArshi");
		driver.findElement((SearchContext) By.id("pass")).sendKeys("oreo");
		driver.findElement((SearchContext) By.name("login")).click();
		String tittle =  ((Object) driver).getTittle();
		//hardassert-Static method
		Assert.assertEquals(tittle, "hgytrfd");
		System.out.println(tittle);
	}
	
	@AfterMethod
	public void closeApp() {
		WebDriver driver = null;
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
