import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_bar {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; //downacsting
		js.executeScript("arguments[0].scrollIntoView();",career);
		Thread.sleep(4000);
		career.click();
		Thread.sleep(4000);
		driver.close();
		
		
		
		
	}

}
