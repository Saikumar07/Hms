package androidDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LongPress_WhatsApp {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
	  Thread.sleep(2000);
	  TouchAction t=new TouchAction(driver);
WebElement e =driver.findElementByAndroidUIAutomator("UiSelector().text(\"Cigniti Sirisha\")");
//driver.findlement.longPress(ElementOption.element(e)).release().perform();	

driver.findElementByAndroidUIAutomator(
   "UiSelector().resourceId(\"com.whatsapp:id/menuitem_conversations_delete\")").click();
	driver.findElementByAndroidUIAutomator("UiSelector().text(\"DELETE\")").click();  
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.HomeActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
