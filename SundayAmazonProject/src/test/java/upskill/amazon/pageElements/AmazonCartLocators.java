package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonCartLocators {
	
	@FindBy(xpath="//button[@value='STANDARD']")
	public WebElement GiftCardDesign;
	
	@FindBy(xpath="//img[@id='gc-mini-picker-design-swatch-image-2']")
	public WebElement CardDesign;

	@FindBy(xpath="//button[@id='gc-mini-picker-amount-4']")
	public WebElement amount;
	
	@FindBy(xpath="//button[@id='gc-delivery-mechanism-button-Email-announce']")
	public WebElement delivery;
	
	@FindBy(xpath="//textarea[@id='gc-order-form-recipients']")
	public WebElement to;
	
	@FindBy(xpath="//input[@id='gc-order-form-senderName']")
	public WebElement from;
	
	@FindBy(xpath="//textarea[@id='gc-order-form-message']")
	public WebElement message;
	
	@FindBy(xpath="//input[@id='gc-order-form-quantity']")
	public WebElement quantity;
	
	@FindBy(xpath="//input[@id='gc-order-form-date-val']")
	public WebElement DeliveryDate;
	
	@FindBy(xpath="//a[contains(text(),'16')]")
	public WebElement Date;
	
	@FindBy(xpath="//input[@id='gc-buy-box-atc']")
	public WebElement addtocart;
	
	

}
