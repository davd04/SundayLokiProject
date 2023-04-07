package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultLocators {
	
	@FindBy(xpath="//div[contains(text(),'Payment, charges or gift cards')]")
	public WebElement Paymentbtn;
	
	@FindBy(xpath="//img[@alt='eGift Cards']")
	public WebElement eGiftCard;

}
