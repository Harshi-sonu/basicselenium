package Practice;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/"); //swiggy open
		driver.findElement(By.xpath("//input[@placeholder='Enter your delivery location']")).sendKeys("Banglore"); //entering delivery loc
		driver.findElement(By.xpath("//span[@class='_2W-T9 _3ZBSs']")).click(); //banglore east loc
		driver.findElement(By.xpath("//div[@class='sc-hZFzCs gFHAzY'][1]")).click(); //
		WebElement biryani = driver.findElement(By.xpath("//img[@alt='Meghana Foods']"));
		org.openqa.selenium.Point points=biryani.getLocation(); //getlocation object creation
		int x=points.getX(); //declaring
		int y=points.getY();
		
		JavascriptExecutor js =(JavascriptExecutor)driver; //scrollbar 
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Meghana Foods']")).click();
		WebElement boneless = driver.findElement(By.xpath("//div[@class='_1RPOp']]"));
		org.openqa.selenium.Point b = boneless.getLocation();
		int x1=b.getX();
		int y1=b.getY();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy("+x1+","+y1+")");
		Thread.sleep(3000);
		boneless.click();
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
