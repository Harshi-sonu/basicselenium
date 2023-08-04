package Practice;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
	    WebElement caffine = driver.findElement(By.xpath("//div[@class='css-o9czyl']"));
	    //downcasting
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",caffine);
	    Thread.sleep(2000);
	    caffine.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//h1[@class='css-1gc4x7i']/..//div[text()='7587']")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    driver.close();
	    

	}

}
