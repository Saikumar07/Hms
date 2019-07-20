package androidDriver;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WhatsApp_Status {
  @Test
  public void f() throws Exception {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "ZY222XKTXX");
	  dc.setCapability("platformVersion", "6.0.1");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	//  WebDriver driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  //driver.findElement(By.id("com.whatsapp:id/tab")).click();
	  driver.findElementByAndroidUIAutomator("UiSelector().text(\"STATUS\")").click();
	  driver.findElementByAndroidUIAutomator("UiSelector().text(\"CALLS\")").click();
	  driver.findElementByAndroidUIAutomator("UiSelector().text(\"CHATS\")").click();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}








