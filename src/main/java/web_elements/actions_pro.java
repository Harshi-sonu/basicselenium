package web_elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actions_pro 
{

	public static void main(String[] args) throws Throwable 
	{
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get("https://www.facebook.com/");
     WebElement Textfeild = driver.findElement(By.xpath("//input[@type='text']"));
     Textfeild .sendKeys("Harshitha");
     Thread.sleep(5000);
     Textfeild.clear();
     Thread.sleep(5000);
     driver.close();
	}

}
