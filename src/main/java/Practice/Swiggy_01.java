package Practice;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy_01 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement pone = driver.findElement(By.xpath("//div[@class='_3Um38 _3lG1r']"));
		pone.sendKeys("12345678");
		//driver.findElement(By.xpath("//a[text()='Login'][2]")).click();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement hotel = driver.findElement(By.xpath("//div[text()='Meghana Foods']"));
		//org.openqa.selenium.Point points = hotel.getLocation();
		//int x = points.getX();
		//int y = points.getY();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy("+x+","+y+")");
		//((WebElement) points).click();
		

	}

}
