package x_Path_Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	

	public static void main(String[] args) throws Throwable
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Phone");
	List<WebElement>value = driver.findElements(By.xpath("//li[@data-view-type='1'][4]"));
	
	
	for(WebElement b : value) 
	{
		System.out.println(b.getText());
	}
	
	Thread.sleep(2000);
	driver.close();
	
	}
}
