package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Testbase;

public class Homepage extends Testbase{
	
	
	
	@FindBy(xpath = "//*[@id='search-input-location']")
	WebElement searchbox;
	
	@FindBy(xpath = "//button[@id='search-submit']")
	WebElement submit;
	
	public String verifyhomepagetitile(){
		String title = driver.getTitle();
		return title;
		
	}
	
	public void searchproperty(String location){
		
		searchbox.sendKeys(location);
		submit.click();
	}
	
	

}
