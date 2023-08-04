package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon 
{
	@Test
	public void amazon()
	{
		driver.findElement(By.id("email")).sendKeys("HArshi");
		driver.close();
	}

}
