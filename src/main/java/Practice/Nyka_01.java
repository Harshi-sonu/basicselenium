package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka_01 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='css-1h4559r e8tshxd0']")).click();
		WebElement search = driver.findElement(By.xpath("//form[@class='css-19j7d8y']"));
		Thread.sleep(5000);
		search.sendKeys("Maybeline");
		Thread.sleep(4000);
		
		search.click();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
