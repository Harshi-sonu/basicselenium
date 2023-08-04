package Vtiger;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintoApp {

	private static final TimeUnit TimeUnits = null;

	public static void main(String[] args) {
		//Launch the browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888");
		
		//Login to application
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		//navigate to home page & contact page
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//clicking on create lookup image
		
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
		//fill all mandot feilds
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Oreo");
		
		//click on save
		
		driver.findElement(By.xpath("//input[@name='button']")).click();
		
		//validate
		
		String Headername = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(Headername.contains("Oreo"))
		{
			System.out.println("Pass");
			System.out.println(Headername);
		}
		else
		{
			System.out.println("Fail");
		}
		
		//Logout of app
		WebElement mouseover = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouseover).perform();
		
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
		
	}

}
