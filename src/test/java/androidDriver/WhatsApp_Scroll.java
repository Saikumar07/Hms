package androidDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WhatsApp_Scroll {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws Exception {
	driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/fab\")").click();
	TouchAction t=new TouchAction(driver);
	//t.press(146, 1022).waitAction().moveTo(146, 422).release().perform();
	Thread.sleep(2000);
	//t.press(146, 1022).waitAction().moveTo(146, 422).release().perform();
	Thread.sleep(2000);
	//t.press(146, 422).waitAction().moveTo(146, 1022).release().perform();
	Thread.sleep(2000);
	//t.press(146, 422).waitAction().moveTo(146, 1022).release().perform();

  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "ZY222XKTXX");
	  dc.setCapability("platformVersion", "6.0.1");
	  dc.setCapability("platformName", "Android");
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
