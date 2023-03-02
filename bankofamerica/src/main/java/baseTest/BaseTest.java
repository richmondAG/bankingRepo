/**
 * 
 */
package baseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.log4j.xml.DOMConfigurator;

/**
 * @author richm
 *
 */
public class BaseTest {

	 public static Properties prop = new Properties();
	 public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	 //public static WebDriver driver =null;
	 
	 public static WebDriver getDriver() {
		return driver.get();
	 }
	 
	 
	 @BeforeSuite(groups= {"Smoke","Sanity" })
	 public void loadProp() throws IOException {
		 
			DOMConfigurator.configure("log4j.xml");
		 
		 try {
			  FileInputStream fil= new FileInputStream(System.getProperty("user.dir")+"\\Config\\configs.properties");
	    	   prop.load(fil);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
	 }
	 
	 
	 
	 @Parameters("browser")
	 @BeforeMethod(groups = {"Smoke", "Sanity"})
	 public void launchApp(String browser) {
		 
		 if(browser.equalsIgnoreCase("Chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver.set(new ChromeDriver());
			 
			 
		 }else  if(browser.equalsIgnoreCase("FireFox")) {
			 WebDriverManager.chromedriver().setup();
			 driver.set(new FirefoxDriver());
			 
		}else if(browser.equalsIgnoreCase("Ie")) {
			WebDriverManager.iedriver().setup();
			driver.set(new InternetExplorerDriver());
			
		}
		 
		 getDriver().manage().window().maximize(); 
		getDriver().get(prop.getProperty("url"));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
	 }
	 
//	 @AfterMethod
//	 public void after() {
//		 getDriver().quit();
//		 
//	 }
}

	
