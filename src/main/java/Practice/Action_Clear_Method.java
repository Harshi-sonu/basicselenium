package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Clear_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.switchTo().frame("auth-login-ui");
		WebElement number = driver.findElement(By.xpath("//input[@inputmode='numeric']"));
        number.sendKeys("9121181820");
        Thread.sleep(3000);
		number.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@aria-label='close Modal']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		WebElement fullname = driver.findElement(By.xpath("//input[@autocomplete='on'][1]"));
		fullname.sendKeys("Harshi");
		WebElement email = driver.findElement(By.xpath("//input[@class='sc-1yzxt5f-9 bbrwhB']"));
		email.sendKeys("dsharshithasonu@gmail.com");
		email.clear();
		fullname.clear();
		Thread.sleep(3000);
		driver.close();
		
	}

}
