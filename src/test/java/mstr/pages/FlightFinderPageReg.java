package mstr.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mstr.config.ConfigReg;
import mstr.utility.CloseBrowserReg;
import mstr.utility.LaunchSiteReg;

public class FlightFinderPageReg {

@FindBy (how=How.XPATH ,	 using ="//img[@src='/images/masts/mast_register.gif']") WebElement objFlightFinderimg ;
@FindBy	(how= How.LINK_TEXT, using="SIGN-OFF") WebElement objsignOff ;
 
public void loadFlightFinderPage()
{
	PageFactory.initElements(ConfigReg.driver ,this); 
	System.out.println("loadFlightFinderPage");
}
public void flightFinderPageImg()
{
	boolean flag = objFlightFinderimg.isDisplayed();
	System.out.println("objFlightFinderimg:  " +flag);
}
public void clickonSignOff()
{
	objsignOff.click();
}
public static void main(String[] args) throws IOException, InterruptedException {
	
	LaunchSiteReg lsr = new LaunchSiteReg();
	lsr.openBrowser("chrome");
	lsr.enterApplicationURL("http://newtours.demoaut.com/mercuryregister.php");
	lsr.maximiseBrowser();
	lsr.waitTillBrowserOpen(15);
	
//*******************************************************************
	
	RegisterPage rp = new RegisterPage();
	rp.loadLoginPage();
	//rp.enterRegisterPage();
	rp.enterFname("sonali2");
	rp.enterLname("turke");
	rp.enterphone("7788994455");
	rp.enteremail("sona@gmail.com");
	rp.enteradr("karve ngr");
	rp.entercity("pune");
	rp.enterstate("maharashtra");
	rp.enterpcode("411052");
	rp.entercountry("INDIA");
	//Select sel= new Select(cnm);
	//sel.selectByVisibleText(propp.getProperty("Country"));
	
	rp.enteruname("sona");
	rp.enterpass("P@ssword1");
	rp.enterCpass("P@ssword1");
	rp.submitbutton();
	
//*********************************************************************
	
	FlightFinderPageReg ffp=  new FlightFinderPageReg();
	ffp.loadFlightFinderPage();
	ffp.flightFinderPageImg();
	ffp.clickonSignOff();
	
//***************************************************************************
	
	CloseBrowserReg cls = new  CloseBrowserReg();
	cls.closeBrowser();
	
}
}
