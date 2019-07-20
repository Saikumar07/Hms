package androidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpicejetSearch {
	AndroidDriver<WebElement>  driver;
  @Test
  public void f() throws Exception{
	  Thread.sleep(3000);
driver.findElementByAndroidUIAutomator("UiSelector().text(\"One Way\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/fromtv\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/et_search\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/et_search\")").sendKeys("ben");
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Bengaluru (BLR)\")").click();

driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/totv\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/et_search\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/et_search\")").sendKeys("che");
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Chennai (MAA)\")").click();

driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/tv_depart_date\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"29\").instance(1)").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Search Flights\")").click();
	   }
  
  @BeforeTest
  public void beforeTest() throws Exception{
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "ZY222XKTXX");
	  dc.setCapability("platformVersion", "6.0.1");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.modules.dispatchmodule.SplashScreenActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
