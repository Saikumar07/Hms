package webdriverHMS;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class AndroidDriver_RID {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() {
	  driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/tab\").instance(1)").click();
	  driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/tab\").instance(2)").click();
	  driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/tab\")").click();
	  driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/conversations_row_contact_name\").instance(2)").click();
	  driver.navigate().back();
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
//	  dc.setCapability("automationName", "uiautomator2");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
