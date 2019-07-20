package webdriverHMS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LaunchWhatsApp {
	DesiredCapabilities dc;
	 WebDriver driver;
  @Test
  public void f() throws Exception{
	  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.whatsapp:id/conversations_row_contact_name']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.whatsapp:id/entry']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.whatsapp:id/entry']")).sendKeys("Hello");
	  driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.whatsapp:id/send']")).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
//	  dc.setCapability("automationName", "uiautomator2");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
