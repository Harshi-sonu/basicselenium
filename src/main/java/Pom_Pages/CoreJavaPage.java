package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage 
{
	@FindBy(xpath="//div[@class='course_detail clearfix'][2]")
	private WebElement corejava;
	
	//intialization
	
	public CoreJavaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 
	//utilization
	
	public void coreJavaSelenium() {
		corejava.click();
	}

}
