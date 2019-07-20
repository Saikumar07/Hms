package androidDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PrintWhatsApp_Contacts {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() {
	driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.whatsapp:id/fab\")").click();
	TouchAction t=new TouchAction(driver);

for(int p=0; p<10; p++){	
	List<WebElement> str=driver.findElements(By.id("com.whatsapp:id/contactpicker_row_name"));
	System.out.println(str.size());
	for (int i = 0; i < str.size(); i++) {
		//if(str.get(i).getText().contains("Agent Mahender Gachabowli")){
		System.out.println(str.get(i).getText());
		//}
	}
	///t.press(146, 1142).waitAction().moveTo(146, 422).release().perform();
}

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
