package androidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WebAutomation {
	DesiredCapabilities dc;
	AndroidDriver<WebElement> driver;
  @Test
  public void f() {
	 driver.get("http://selenium4testing.com");
	 driver.findElement(By.id("closediv")).click();
	 driver.findElement(By.linkText("Manual FAQs")).click();
	 driver.findElement(By.linkText("Selenium FAQs")).click();
	 driver.findElement(By.linkText("Core Java FAQs")).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  	dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "ZY222XKTXX");
		dc.setCapability("platformVersion", "6.0.1");
		dc.setCapability("platformName", "Android");
		dc.setCapability("chromedriverExecutable", "D:\\Lib\\chromedriver.exe");
		dc.setCapability("browserName", "Chrome");
		dc.setCapability("fullReset", false);
		dc.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
  }

  @AfterTest
  public void afterTest() {
  }

}
