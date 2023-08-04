package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Browser {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//li[@class='dropdown'][2]")).click();
		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		Set<String> child=driver.getWindowHandles(); //shifting to child page
		for(String b:child) {
			driver.switchTo().window(b);
		}
		//handling chid browser elements
		driver.findElement(By.id("mytext")).sendKeys("harshi");
		
		//shifting to parent page
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		Thread.sleep(2000);
		
		
		
		
		driver.quit();
		

	}

}
