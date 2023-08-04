package x_Path_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path_Id {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Oreo");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("HarshiOreo");
		Thread.sleep(3000);
		driver.close();
				
		
		
		
	}

}
