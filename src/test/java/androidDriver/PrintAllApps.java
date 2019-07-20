package androidDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PrintAllApps {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() {
List<WebElement> str1=	driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.sec.android.app.launcher:id/iconview_imageView']"));
List<WebElement> str=	driver.findElements(By.className("android.widget.ImageView"));
System.out.println(str1.size());
System.out.println(str.size());
/*for (int i = 0; i < str.size(); i++) {
	System.out.println(str.get(i).getText());
}*/
	TouchAction t=new TouchAction(driver);
	t.press(ElementOption.element(str1.get(7))).waitAction().moveTo(ElementOption.element(str1.get(2))).release().perform();
for(int j=0; j<3; j++) {
	List<WebElement> names=	driver.findElements(By.className("android.widget.TextView"));
	for (int i = 0; i < names.size(); i++) {
		System.out.println(names.get(i).getText());
	}
	t.press(ElementOption.point(580, 755)).waitAction().moveTo(ElementOption.point(44, 755)).release().perform();
}
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  DesiredCapabilities dc=new DesiredCapabilities();
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
