package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePageLocators {
	
	@FindBy(xpath="//a[contains(text(),'Help')]")
	public WebElement helpbtn;

	@FindBy(xpath="//span[@class='icp-nav-link-inner']")
	public WebElement languagehover;
	
	@FindBy(xpath="//span[1][contains(text(),'español')]")
	public WebElement spanish;
	
	@FindBy(xpath="//span[contains(text(),'Hola, Identifícate')]")
	public WebElement spanishtxt;
	
	@FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
	public WebElement GiftCard;
	

}
