package Testpages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.Homepage;
import pageobjects.Propertypage;
import utilities.Testbase;

public class HomepageTest{
	
Homepage homepage;
Propertypage propertypage;


@BeforeMethod
public void setup(){
	
	homepage = Testbase.getInstance(Homepage.class);
	propertypage = new Propertypage();
	
}
@Test
public void verifyhomepage(){
	
	String pagetitle = homepage.verifyhomepagetitile();
	System.out.println(pagetitle);
	Assert.assertEquals("Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents",pagetitle);
	homepage.searchproperty("London");
	propertypage.sortpricesofproperties();
}










}
