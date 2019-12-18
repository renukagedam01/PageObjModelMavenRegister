package mstr.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import mstr.config.ConfigReg;

public class LaunchSiteReg {

	Properties prop = new Properties();
	
	public void openBrowser(String browsernm) throws IOException
	{
		FileInputStream fis= new FileInputStream("F:\\Testing Workplace\\PageObjModelMavenRegister\\src\\test\\resources\\Config.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeExePath"));

			ConfigReg.driver = new ChromeDriver();
		}
		else{
			System.setProperty("webdriver.ie.driver", prop.getProperty("ieExePath"));
			ConfigReg.driver= new InternetExplorerDriver();
		} 			
	}
	
	public void enterApplicationURL(String url)
	{
		ConfigReg.driver.get(url);
	}
	
	public void maximiseBrowser()
	{
		ConfigReg.driver.manage().window().maximize();
	}
	
	public void waitTillBrowserOpen(int Sec) throws InterruptedException
	{
		ConfigReg.driver.manage().timeouts().pageLoadTimeout(Sec , TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		LaunchSiteReg lsr=  new LaunchSiteReg();
		lsr.openBrowser("chrome");
		lsr.enterApplicationURL("http://newtours.demoaut.com/mercuryregister.php");
		lsr.maximiseBrowser();
		lsr.waitTillBrowserOpen(15);
		System.out.println("waitTillBrowserOpen");
	}
}

