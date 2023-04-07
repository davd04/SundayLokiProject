package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShettyLocators {

	@FindBy(xpath="//input[@id='alertbtn']")
	public WebElement alertbtn;
	
	@FindBy(xpath="//input[@id='confirmbtn']")
	public WebElement confirmbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement btnhome;
}
