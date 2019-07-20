package androidDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DragDrop {
	AndroidDriver<WebElement> driver;

	@Test
	public void f() {
driver.findElementByAndroidUIAutomator(
				"UiSelector().text(\"Basic usage playground\")").click();
WebElement e1 = driver.findElementByAndroidUIAutomator(
		"UiSelector().resourceId(\"com.mobeta.android.demodslv:id/drag_handle\")");
WebElement e2 = driver.findElementByAndroidUIAutomator(
	"UiSelector().resourceId(\"com.mobeta.android.demodslv:id/drag_handle\").instance(4)");
TouchActions t = new TouchActions(driver);
//t.longPress(e1).moveTo(e2).release().perform();
//t.longPress(longPressOptions)
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "ZY222XKTXX");
		dc.setCapability("platformVersion", "6.0.1");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "com.mobeta.android.demodslv");
		dc.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		dc.setCapability("fullReset", false);
		dc.setCapability("noReset", true);
		driver = new AndroidDriver<WebElement>(new URL(
				"http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() {
	}

}
