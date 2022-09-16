package Registartionflow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegflowwithSignin 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://members.staging.innogrp.com");
		
		FluentWait<ChromeDriver> w=new FluentWait<ChromeDriver>(driver);
		w.withTimeout(Duration.ofSeconds(40));
		w.pollingEvery(Duration.ofMillis(1000));
	    w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign in']"))).click();
	   
	   try
	   {
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_login']"))) .sendKeys("testuser1.26@Example.com");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_pass']"))) .sendKeys("Password1!");
		 //w.until(ExpectedConditions.elementToBeClickable(By.id("//input[@name='rememberme']"))).click();
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='wp-submit']"))).click();
	    	}
	   catch(Exception ex)
	   {
	   System.out.println("The exception is" +ex);
		 
	   }
		 
		 driver.manage().window().maximize();
		 Actions a =new Actions(driver);
		 WebElement Ue=w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Upcoming Events")));
		 a.moveToElement(Ue).perform();
		 WebElement Es=w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Events Schedule")));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",Es);
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Registration Event-1']"))).click();
		 
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Increase ticket quantity for New ticket']"))).click();
		 
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Get Tickets']"))).click();
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='checkout-button']"))).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='authnet-card-number']"))) .sendKeys("4111111111111111");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='authnet-card-expiry']"))).sendKeys("02/34");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='authnet-card-cvc']"))).sendKeys("123");
	}

}
