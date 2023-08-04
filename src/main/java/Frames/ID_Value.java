package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ID_Value {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		 driver.get("https://www.snapdeal.com/");
		 WebElement signin = driver.findElement(By.xpath("//div[@class='myAccountTab accountHeaderClass col-xs-13 reset-padding']")); //signin button
		 Actions a=new Actions(driver);
		 a.moveToElement(signin).perform(); //mouse over
         driver.findElement(By.xpath("//span[@Class='accountBtn btn rippleWhite']")).click(); //login button
         driver.switchTo().frame("loginIframe"); //frame(login frame)
         driver.findElement(By.xpath("//input[@class='col-xs-24']")).sendKeys("Harshi"); //textfeild harshi
         Thread.sleep(1000);
         driver.findElement(By.xpath("//i[@style='color: #cdcece;']")).click();
         driver.switchTo().defaultContent();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).sendKeys("1234");
         Thread.sleep(3000);
         driver.close();
	}

}
