package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement signin = driver.findElement(By.xpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']"));
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		
		

	}

}
