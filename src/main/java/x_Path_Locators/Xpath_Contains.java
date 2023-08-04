package x_Path_Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Contains {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='See more']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')]/../../../..//span[@class='a-price-whole']")).click();
		Thread.sleep(1000);
		List<WebElement> value=driver.findElements(By.xpath("//span[@id='productTitle']/../../../..//span[@id='acrCustomerReviewText']"));
		
		for(WebElement w : value)
		{
			System.out.println(w.getText());
		}
		driver.close();
		
	}

}
