package javatestcases;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Case1 extends CreateDriver{
	@Test
	public void case11() throws Exception
	{
	  ResourceBundle rb= ResourceBundle.getBundle("Element");
      //f.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Thread.sleep(20000);
      f.get("https://www.gmail.com/");
      f.findElementById(rb.getString("Gmail_EmailID")).sendKeys("ji123rathiiji@gmail.com");
      f.findElementById(rb.getString("Gmail_Pwd")).sendKeys("123456@123");
      f.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      f.findElementById(rb.getString("Gmail_Signin")).click();
      Thread.sleep(1000);
     // f.findElement(By.xpath("//div[@class='z0']/div")).click();
      //f.findElementByClassName("vO").sendKeys("pathy789@gmail.com");
     // f.findElementByClassName("aoT").sendKeys("Status Mail!");
      
	}
}
