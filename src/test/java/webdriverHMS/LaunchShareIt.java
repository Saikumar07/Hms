package webdriverHMS;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LaunchShareIt {
  @Test
  public void f() throws Exception{
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  
	  dc.setCapability("appPackage", "com.lenovo.anyshare.gps");
	  dc.setCapability("appActivity", "com.lenovo.anyshare.main.MainActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	WebDriver driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);  
	  
  }
}




















