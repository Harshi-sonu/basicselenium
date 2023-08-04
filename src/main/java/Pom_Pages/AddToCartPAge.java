package Pom_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPAge 
{
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addbtn;
	
	@FindBy(xpath="//button[.=' Add to Cart']")
	private WebElement addtocartbtn;
	
	//intializtion
	
	public AddToCartPAge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getAddBtn() {
		return addbtn;
	}
    
	public void AddToCartButton() {
		addtocartbtn.click();
	}
}
