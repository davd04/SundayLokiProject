package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	    //Shirt size type 
	    @FindBy (xpath="//select[@aria-label = 'Please select a Size Type']")
	     public WebElement ddSizeType;
	
	    //Shirt men size 
		 @FindBy (xpath="//select[@id='x-msku__select-box-1001']")
		 public WebElement ddMenSize;
		
		//Shirt Shade 
		@FindBy (xpath="//select[@aria-label = 'Please select a Shade']")
		public WebElement ddShade;
		
		//Shirt Quantity
		@FindBy (xpath="//input[@id='qtyTextBox']")
		public WebElement txtbxQty;
		
		//Add to Cart
		@FindBy (xpath="//span[text()='Add to cart']")
		public WebElement btnAddCart;

}