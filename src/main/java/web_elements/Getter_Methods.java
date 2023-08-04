package web_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_Methods 
{
    public static void main(String[] args) 
    {
    	WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
       WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
      Point loc = password.getLocation();
      System.out.println(loc.getX());
      System.out.println(loc.getY());
      driver.close();
      
      
		
	}
}
