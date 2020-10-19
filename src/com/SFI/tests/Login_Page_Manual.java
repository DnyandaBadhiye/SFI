package com.SFI.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Login_Page_Manual {
	static WebDriver driver;
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:/Selenium software/Drivers/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://pestwatcher-test-sfi-uat.azurewebsites.net/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	String ActualTitle=driver.getTitle();
	String ExpectedTitle="SFI";
	if(ActualTitle.equals(ExpectedTitle))
	{
	System.out.println("Title is matched");

	}else
	{
		System.out.println("Title does not matched");
	}
	
	driver.findElement(By.xpath("//*[@id=\"main-content\"]/app-tutorial/ion-footer/ion-grid/ion-row/ion-col[1]/ion-button")).click();
	boolean Logo=driver.findElements(By.xpath("//*[@id=\"main-content\"]/app-signup/ion-content/ion-card/ion-card-content/ion-card[1]/ion-card-content/img")).size()==1;
	Assert.assertEquals(Logo,true);
	System.out.println("Logo is displayed");
	
	driver.findElement(By.xpath("//*[@class='mat-select-placeholder ng-tns-c5-1 ng-star-inserted']")).click();
	driver.findElement(By.xpath("//*[@class='mat-select-placeholder ng-tns-c5-1 ng-star-inserted']")).sendKeys("English");
	driver.findElement(By.id("mat-input-0")).clear();
	driver.findElement(By.id("mat-input-0")).sendKeys("abd");
	driver.findElement(By.id("mat-input-1")).clear();
	driver.findElement(By.id("mat-input-1")).sendKeys("abd@gmail.com");
	driver.findElement(By.id("mat-input-2")).clear();
	driver.findElement(By.id("mat-input-2")).sendKeys("abcd123");
	driver.findElement(By.id("mat-input-3")).clear();
	driver.findElement(By.id("mat-input-3")).sendKeys("abcd123");
	driver.findElement(By.linkText("Sign Up"));
	driver.quit();
	
}
	
	
	
	
	
}
