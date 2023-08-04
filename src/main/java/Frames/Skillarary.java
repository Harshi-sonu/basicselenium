package Frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Skillarary {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement drop = driver.findElement(By.id("cars"));
		Select s=new Select(drop);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("90");
		Thread.sleep(2000);
		s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectByValue("90");
		
		//to fetch all options in console
		List<WebElement> a = s.getOptions();
		for(WebElement b : a ) {
			System.out.println(b.getText());
		}
		
		
		
		
		
		
		
		
		driver.close();

	}

}
