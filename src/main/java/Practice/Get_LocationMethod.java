package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_LocationMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		WebElement fullname = driver.findElement(By.xpath("//section[@class='sc-1yzxt5f-4 ioJwpZ'][1]"));
		Point loc = fullname.getLocation();
		System.out.println("The X and y co ordinates of full name textfeild are as below");
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		driver.close();

	}

}
