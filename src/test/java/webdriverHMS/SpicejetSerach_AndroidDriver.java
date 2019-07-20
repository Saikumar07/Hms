package webdriverHMS;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class SpicejetSerach_AndroidDriver {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
	   //driver.findElement(By.xpath(""))
	  Thread.sleep(3000);
	  driver.findElementByAndroidUIAutomator("UiSelector().text(\"BLR\")").click();
	  driver.findElementByAndroidUIAutomator("UiSelector().text(\"Enter airport code/city\")").click();
	  driver.findElementByAndroidUIAutomator("UiSelector().text(\"Enter airport code/city\")").sendKeys("Bengaluru");
	  driver.findElementByAndroidUIAutomator("UiSelector().text(\"BLR - Bengaluru, India\")").click();
	  driver.findElementByAndroidUIAutomator("UiSelector().text(\"BLR - Bengaluru, India\")").click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.MainActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  
	 driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
