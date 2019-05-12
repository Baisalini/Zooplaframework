package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Driverfactory {
	
	private static Driverfactory instance = null;
	public WebDriver driver;
	private Properties prop=null;
	private FileInputStream fileinput=null;
	private final String filepath="C:/Users/user/workspace/Zooplaproject/src/test/java/resources/commonconfiguration.properties";
	
	
	
	
	private Driverfactory(){
		//get browser info from properties file
		
		try
		{
			fileinput = new FileInputStream(filepath);
			prop = new Properties();
			try
			{
				prop.load(fileinput);
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		String brwosername = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		driver = Browserfactroy.getdriver(brwosername);
		driver.get(url);
	}
	
	public static Driverfactory getinstance(){
		
		if(instance==null){
			instance = new Driverfactory();
		}
		return instance;
	}

}
