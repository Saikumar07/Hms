package webdriverHMS;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SpicejetSearchNew {
	AndroidDriver<WebElement>  driver;
  @Test
  public void f() throws Exception{
	  Thread.sleep(3000);
driver.findElementByAndroidUIAutomator("UiSelector().text(\"One Way\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"BLR\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Enter airport code/city\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Enter airport code/city\")").sendKeys("ben");
driver.findElementByAndroidUIAutomator("UiSelector().text(\"BLR - Bengaluru, India\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"BLR - Bengaluru, India\")").click();

driver.findElementByAndroidUIAutomator("UiSelector().text(\"MAA\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Enter airport code/city\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Enter airport code/city\")").sendKeys("chenna");
driver.findElementByAndroidUIAutomator("UiSelector().text(\"BLR - Bengaluru, India\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"BLR - Bengaluru, India\")").click();

driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.vl.spicejet:id/tv_depart_date\")").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"29\").instance(1)").click();
driver.findElementByAndroidUIAutomator("UiSelector().text(\"Search Flights\")").click();
	   }
  
  @BeforeTest
  public void beforeTest() throws Exception{
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.MainActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  HttpCommandExecutor executor = new HttpCommandExecutor(MobileCommand.commandRepository, new URL("http://0.0.0.0:4723/wd/hub"));
	  driver=new AndroidDriver<WebElement>(executor, dc); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
