package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.ShettyLocators;
import upskill.utilities.SetupDrivers;

public class ShettyPageActions {
	
	ShettyLocators ShettyLocatorsObj;
	
	public ShettyPageActions(){
		
		
		ShettyLocatorsObj = new ShettyLocators();
		PageFactory.initElements(SetupDrivers.driver, ShettyLocatorsObj);

	}
	
	public void AlertButton(String Button){
		if(Button.equals("Alert")){
			ShettyLocatorsObj.alertbtn.click();
		} else if (Button.equals("Confirm")){
			ShettyLocatorsObj.confirmbtn.click();
		} else {
			System.out.println("Button not found");
		}
			
	}
	
	public void handlealert(String Alert){
		if(Alert.equals("ok")){
			SetupDrivers.driver.switchTo().alert().accept();
		} else if(Alert.equals("Cancel")){
			SetupDrivers.driver.switchTo().alert().dismiss();
		} else {
			System.out.println("Button not found");
		}
	}
	
	public void loadShettyHomepage() throws Exception{
		SetupDrivers.driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
	}
	
	public void clickIframeHome(){
		
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		
		for(int i=0; i<framelist.size(); i++){
			SetupDrivers.driver.switchTo().frame(i);
			
			try {
				ShettyLocatorsObj.btnhome.click();
			} catch (Exception e) {
				System.out.println("Element not found in iframe");
			}
		}
		
	}
	
	public void verifyShettyHome() throws Exception{
		Thread.sleep(3000);
		ShettyLocatorsObj.btnhome.isDisplayed();
	}
	
	
	public void handleIframe(){
		
		//i find iframe using iframe tag in DOM or HTML
		//i use switchTo().frame() to switch iframes
		
		//Switch iframe by Index
		SetupDrivers.driver.switchTo().frame(0);
		SetupDrivers.driver.switchTo().frame(1);
		
		//Switch iframe by Name or ID
		SetupDrivers.driver.switchTo().frame("iframe-name");
		SetupDrivers.driver.switchTo().frame("id");
		
		//Switch back to previous iframe
		SetupDrivers.driver.switchTo().defaultContent();
		SetupDrivers.driver.switchTo().parentFrame();
		SetupDrivers.driver.switchTo().frame("parent");
		
		//nested iframe
		SetupDrivers.driver.switchTo().frame("inner");
		SetupDrivers.driver.switchTo().frame("child");
	} 
}

	

