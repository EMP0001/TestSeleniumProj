package cbis;

	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class clickonsubmenu {

	@Test
	public void selectsubmenu()
	{
	//OPEN BROWSER
	FirefoxDriver f = new FirefoxDriver();

	f.manage().window().maximize();
	f.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	f.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	//LOGIN
	f.get("http://27.251.135.51/CBISportallive/src/UI/Login.aspx");
	f.findElementById("txtUserID").sendKeys("testcbis");
	f.findElementById("txtPassword").sendKeys("admin@123");
	f.findElementById("btnLogin").click();
	Actions action = new Actions(f);
	//NAVIGATING TO Customer --> Location Maintenance --> Add
	WebElement we = f.findElementByXPath(".//*[@id='ctl00_menu_menuBarn1']/table/tbody/tr/td[1]/a");
	action.moveToElement(we);
	we = f.findElementByXPath(".//*[@id='ctl00_menu_menuBarn8']/td/table/tbody/tr/td[1]/a");
	action.moveToElement(we);
	we = f.findElementByXPath(".//*[@id='ctl00_menu_menuBarn11']/td/table/tbody/tr/td/a");
	action.moveToElement(we).build().perform();
	we.click();
	//NAVIGATING TO Delivery --> Hardware --> Part No List
	we = f.findElementByXPath(".//*[@id='ctl00_menu_menuBarn2']/table/tbody/tr/td[1]/a");
	action.moveToElement(we);

	we = f.findElementByXPath(".//*[@id='ctl00_menu_menuBarn26']/td/table/tbody/tr/td[1]");
	action.moveToElement(we);
	we = f.findElementByXPath(".//*[@id='ctl00_menu_menuBarn47']/td/table/tbody/tr/td/a");
	action.moveToElement(we).build().perform();
	we.click();
	//LOGOUT
	f.findElementById("ctl00_img").click();
	//BROWSER CLOSE
	f.quit();
	}


}
