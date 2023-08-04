package Practice;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_size_Method {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		WebElement fullname = driver.findElement(By.xpath("//section[@class='sc-1yzxt5f-4 ioJwpZ'][1]"));
	    org.openqa.selenium.Dimension s = fullname.getSize();
	    System.out.println("The size of full textfeild are as below");
	    System.out.println(s.getHeight());
	    System.out.println(s.getWidth());
	    driver.close();

	}

}
