package androidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Swipe_Horizantal {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
	WebElement e1=  driver.findElementByAndroidUIAutomator("UiSelector().text(\"Gmail\")");
	WebElement e2=  driver.findElementByAndroidUIAutomator("UiSelector().text(\"YouTube\")");
	  Thread.sleep(2000);
	  TouchAction t=new TouchAction(driver);
	  t.press(ElementOption.element(e1)).waitAction().moveTo(ElementOption.element(e2)).release().perform();
	/*  t.press(527, 518).waitAction().moveTo(26, 518).release().perform();
	  Thread.sleep(2000);
	  t.press(527, 518).waitAction().moveTo(26, 518).release().perform();
	  Thread.sleep(2000);
	  t.press(527, 518).waitAction().moveTo(26, 518).release().perform();
	  
	  t.press(26, 518).waitAction().moveTo(527, 518).release().perform();
	  t.press(26, 518).waitAction().moveTo(527, 518).release().perform();
	  t.press(26, 518).waitAction().moveTo(527, 518).release().perform();*/
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.sec.android.app.launcher");
	  dc.setCapability("appActivity", "com.sec.android.app.launcher.activities.LauncherActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
