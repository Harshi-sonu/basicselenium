package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra_Shopping {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		WebElement makeup = driver.findElement(By.xpath("//li[@class='MegaDropdownHeadingbox'][1]"));
		Actions a=new Actions(driver);
		a.moveToElement(makeup).perform();
		a.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Top Brands'][1]"));
		Thread.sleep(8000);
		driver.close();
		
		
		

	}

}
