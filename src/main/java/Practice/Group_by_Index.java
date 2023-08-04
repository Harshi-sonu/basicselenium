package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_by_Index {

	public static void main(String[] args) throws Throwable
    {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("phone");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//b[text()='pe customer care number anantapur']"));
		for(WebElement b : list) {
			System.out.println(b.getText());
		}
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
