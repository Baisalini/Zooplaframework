package pageobjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Testbase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Propertypage extends Testbase{

	
	public Propertypage(){
	
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//ul[@class='listing-results clearfix js-gtm-list']/li[@class='srp clearfix   ']/div/div[2]/a")
	List<WebElement> prices;
	
	@FindBy(xpath = "//h1[starts-with(text(),'Property for sale in')]")
	WebElement listheading;
	
	
	public void sortpricesofproperties(){
		ArrayList<String> pricelist = new ArrayList<String>();
		for(int i=0;i<prices.size();i++){
		pricelist.add(prices.get(i).getText());
			
		}
	    Collections.sort(pricelist);
	    System.out.println(pricelist);
	}
	
	
}
