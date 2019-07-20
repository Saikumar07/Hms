package webdriverHMS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class NewTest {
	Logger l=Logger.getLogger(NewTest.class);
	
  @Test
  public void f() throws MalformedURLException {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	//  AndroidDriver<WebElement> driver = null;
	  AndroidDriver<WebElement> driver = null;
	try {
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	} catch (Exception e) {
		System.out.println("Error");
	}
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	  driver.findElementByAndroidUIAutomator(
				"UiSelector().resourceId(\"com.whatsapp:id/tab\").instance(1)").click();
		driver.findElementByAndroidUIAutomator(
				"UiSelector().resourceId(\"com.whatsapp:id/tab\").instance(2)").click();
		driver.findElementByAndroidUIAutomator(
				                 "UiSelector().resourceId(\"com.whatsapp:id/tab\")").click();
	 
  }
}
