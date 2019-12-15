package mstr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mstr.config.ConfigReg;
import mstr.utility.LaunchSiteReg;



public class RegisterPage 
{
// @FindBy(how = How.LINK_TEXT,  using ="REGISTER")WebElement objregisterpg;

	
@FindBy (how= How.XPATH ,	using ="//input[@name='firstName']") WebElement objFname;
@FindBy (how = How.XPATH , 	using ="//input[@name='lastName']") WebElement objlName;
@FindBy (how= How.XPATH , 	using= "//input[@name='phone']" ) WebElement objPhone;
@FindBy (how=  How.XPATH ,	using ="//input[@name='userName']") WebElement objMail;
@FindBy (how =How.XPATH , 	using= "//input[@name='address1']" ) WebElement objAdr;
@FindBy (how = How.XPATH ,  using ="//input[@name='city']") WebElement objCity;
@FindBy (how=  How.XPATH ,  using ="//input[@name='state']") WebElement objState;
@FindBy (how=  How.XPATH ,  using ="//input[@name='postalCode']") WebElement objPcode ;

@FindBy (how= How.XPATH , 	using ="//select[@name='country']") WebElement objCountry;

@FindBy (how = How.XPATH , using ="//input[@name='email']") WebElement objUname;
@FindBy (how = How.XPATH , using ="//input[@name='password']") WebElement objPass;
@FindBy (how = How.XPATH , using ="//input[@name='confirmPassword']") WebElement objCpass; 
@FindBy (how = How.XPATH , using ="//input[@name='register']") WebElement objsubmit;

public void loadLoginPage()
{
	PageFactory.initElements(ConfigReg.driver,this);	
}

//public void enterRegisterPage()
//{
//	objregisterpg.click();
//}
public void enterFname(String fname){
	objFname.sendKeys(fname);
}
public void enterLname(String lname)
{
	objlName.sendKeys(lname);
}
public void enterphone(String phone)
{
	objPhone.sendKeys(phone);
}
public void enteremail(String email)
{
	objMail.sendKeys(email);
}
public void enteradr(String adr)
{
	objAdr.sendKeys(adr);
}
public void entercity(String city)
{
	objCity.sendKeys(city);
}
public void enterstate(String state)
{
	objState.sendKeys(state);
}
public void enterpcode(String pcode)
{
	objPcode.sendKeys(pcode);
}
public void entercountry(String country)
{
	objCountry.sendKeys(country);
}
public void enteruname(String uname)
{
	objUname.sendKeys(uname);
}
public void enterpass(String pass)
{
	objPass.sendKeys(pass);
}
public void enterCpass(String cpass)
{
	objCpass.sendKeys(cpass);
}
public void submitbutton() throws InterruptedException 
{
	Thread.sleep(2000);
	objsubmit.click();
	Thread.sleep(2000);
}
public static void main(String[] args) throws Exception {
	
	LaunchSiteReg   lsr= new LaunchSiteReg();
	lsr.openBrowser("chrome");
	lsr.enterApplicationURL("http://newtours.demoaut.com/mercuryregister.php");
	lsr.maximiseBrowser();
	lsr.waitTillBrowserOpen(15);
	
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
	

	
}}
