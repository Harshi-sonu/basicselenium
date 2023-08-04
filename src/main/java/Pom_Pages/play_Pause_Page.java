package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class play_Pause_Page 
{
	@FindBy(xpath="//a[@class='addtowishlist']")
	private WebElement addtowish;
	
	
	
	//intialization
	public play_Pause_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public 
	
	

}
