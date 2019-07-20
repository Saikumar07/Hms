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

public class SpicejetSearch {
	DesiredCapabilities dc;
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  Thread.sleep(4000);
driver.findElement(By.xpath("//android.widget.TextView[@text='One Way']")).click();
driver.findElement(By.id("com.vl.spicejet:id/fromtv")).click();
driver.findElement(By.id("com.vl.spicejet:id/tv_city_name")).click();
driver.findElement(By.id("com.vl.spicejet:id/totv")).click();
driver.findElement(By.xpath("//android.widget.TextView[@text='Kolkata (CCU)']")).click();
driver.findElement(By.xpath("//android.widget.TextView[@text='Search Flights']")).click();
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.vl.spicejet");
	  dc.setCapability("appActivity", "com.vl.spicejet.MainActivity");
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
