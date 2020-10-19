package com.SFI.tests;

	import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;
	import static org.testng.Assert.*;
	import org.openqa.selenium.*;
    import org.openqa.selenium.chrome.ChromeDriver;

	public class Katalon_Login1 {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Selenium software/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("https://pestwatcher-test-sfi-uat.azurewebsites.net/login;randomNr=t3768qBk;skipLocationChange=true");
	    driver.findElement(By.xpath("//ion-router-outlet[@id='main-content']/app-login/ion-content/ion-card/ion-card-content/ion-card/ion-card-content/img")).click();
	    driver.findElement(By.xpath("//ion-router-outlet[@id='main-content']/app-login/ion-content/ion-card/ion-card-content/form/div[3]/button/span")).click();
	    driver.findElement(By.xpath("//mat-select[@id='mat-select-0']/div/div/span")).click();
	    driver.findElement(By.xpath("//mat-option[@id='mat-option-1']/span")).click();
	    driver.findElement(By.id("mat-input-2")).click();
	    driver.findElement(By.id("mat-input-2")).clear();
	    driver.findElement(By.id("mat-input-2")).sendKeys("Dnyanda");
	    driver.findElement(By.id("mat-input-3")).clear();
	    driver.findElement(By.id("mat-input-3")).sendKeys("dnyanda@test.com");
	    driver.findElement(By.id("mat-input-4")).clear();
	    driver.findElement(By.id("mat-input-4")).sendKeys("Vspl@123");
	    driver.findElement(By.id("mat-input-5")).clear();
	    driver.findElement(By.id("mat-input-5")).sendKeys("Vspl@123");
	    driver.findElement(By.xpath("//ion-router-outlet[@id='main-content']/app-signup/ion-content/ion-card/ion-card-content/form/div[2]/button[2]")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

