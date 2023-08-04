package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Red_Bus {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.com/");
		//driver.findElement(By.xpath("//button[text()='Okay']")).click();
		driver.findElement(By.xpath("//div[@id='date-box']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='July']/../..//span[text()='26'][1]")).click();
		Thread.sleep(3000);
		
		//driver.close();

	}

}
