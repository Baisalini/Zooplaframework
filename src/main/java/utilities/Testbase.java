package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Testbase {
	
public static Driverfactory driverres = Driverfactory.getinstance()	;
public static WebDriver driver = driverres.driver;

public static <C extends Testbase> C getInstance(Class<C> clazz){
	
	C page = PageFactory.initElements(driver, clazz);
	return page;
	
	
}

	

}
