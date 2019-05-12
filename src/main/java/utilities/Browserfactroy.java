package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactroy {
	
	
	public static WebDriver getdriver(String browsername){
		WebDriver driver;
		switch(browsername.toLowerCase()){
		
		case "firefox":
			driver = new FirefoxDriver();
			break;
		
		
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:/Users/user/Desktop/chromedriver.exe" );
		    driver = new ChromeDriver();
		    break;
		    
		default:
			System.setProperty("webdriver.chrome.driver","C:/Users/user/Drivers/chromedriver.exe" );
			driver = new ChromeDriver();
		
		
		}
		
		return driver;
		
		
		
		
		
		
	}

}
