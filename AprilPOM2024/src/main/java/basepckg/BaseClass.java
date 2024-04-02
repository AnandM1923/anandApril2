package basepckg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	
	public WebDriver driver;
	public Properties prop;
	
	
	public void ReadDriver() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Properties\\prop.properties");
		prop = new Properties();
		prop.load(fis);
		String Browsername=prop.getProperty("browser");
		
		if(Browsername.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();			
		}else if(Browsername.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(Browsername.equalsIgnoreCase("ie")){
			driver=new InternetExplorerDriver();
		}
		else {
			System.out.println("Please give proper browser Name");
			}
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
	}
	
	

}
