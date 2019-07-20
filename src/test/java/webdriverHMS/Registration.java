package webdriverHMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration {
	private WebDriver driver;
	String prNo;
  @Test(description="Verify the login functionality")
  public void test1() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
  }
  
  @Test(description="Verify the navigation of Registration")
  public void test2(){
	  driver.findElement(By.linkText("Registration")).click();
  }
  
  @Test(description="Verify the create patient functionality")
  public void test3() throws Exception{
	  new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByIndex(1);
		new Select(driver.findElement(By.name("RELATION"))).selectByIndex(2);
		new Select(driver.findElement(By.name("TITLE"))).selectByIndex(2);
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Robo");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Neelam");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Avinash");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("12345");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Lal");
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.className("tcalSelected")).click();
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("27");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Female");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("English");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("image")).sendKeys("c:\\Nagesh\\test.png");
		driver.findElement(By.name("ADDRESS1")).sendKeys("5-5-5/8 Abids,hyderabad");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9885304480");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("neelam0401@gmail.com");
		driver.findElement(By.name("ZIP")).sendKeys("500001");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000); //3 secs
  }
  

  @BeforeTest
  public void beforeTest() {
	//  System.setProperty("webdriver.chrome.driver", "D:\\Testing30AMBatch\\Lib\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://selenium4testing.com/hms");
  }

  @AfterTest
  public void afterTest() {
	//  driver.quit();
  }

}
