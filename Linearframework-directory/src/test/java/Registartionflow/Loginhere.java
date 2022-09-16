package Registartionflow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginhere 
{
	
	
	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://members.staging.innogrp.com");
		FluentWait<ChromeDriver> w=new FluentWait<ChromeDriver>(driver);
		w.withTimeout(Duration.ofSeconds(40));
		w.pollingEvery(Duration.ofMillis(1000));
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
		 
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tribe-tickets_168567_first-name_1']")))
		 .sendKeys("test4568.0");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='tribe-tickets__form-field-input-wrapper'])[2]")))
		 .sendKeys("user");
		 
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tribe-tickets_168567_email_1']")))
		 .sendKeys("testuser4568.0@Example.com");
		 WebElement e= w.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='tribe-tickets_168567_credential_1']")));
		 Select s=new Select(e);
		 s.selectByVisibleText("DO");
		 
		 w.until(ExpectedConditions.elementToBeClickable(By.id("tribe-tickets_168567_printed-syllabus_1_a6105c0a611b41b08f1209506350279e")))
		 .click();

		 //w.until(ExpectedConditions.elementToBeClickable(By.id("tribe-tickets_168567_printed-syllabus_1_7fa3b767c460b54a2be4d49030b349c7"))).click();
		 
		 w.until(ExpectedConditions.elementToBeClickable(By.id("//input[@value='In Person']")))
		 .click();
		 
		 //w.until(ExpectedConditions.elementToBeClickable(By.id("//input[@value='Virtual / Live Stream']"))).click();
		 
		 //code for click on save and view cart
		 w.until(ExpectedConditions.elementToBeClickable(By.id("//button[@name='cart-button']"))).click();
		 w.until(ExpectedConditions.elementToBeClickable(By.id("//a[@class='checkout-button button alt wc-forward']"))).click();
		 //code for click on checkout button
		 w.until(ExpectedConditions.elementToBeClickable(By.id("//button[@name='checkout-button']"))).click();
		 //Login here code
		 w.until(ExpectedConditions.elementToBeClickable(By.id("//a[text()='Log in here']"))).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_login']"))) .sendKeys("testuser1.70@Example.com");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user_pass']"))) .sendKeys("Password1!");
		 w.until(ExpectedConditions.elementToBeClickable(By.id("//input[@name='rememberme']"))).click();
		 w.until(ExpectedConditions.elementToBeClickable(By.id("//button[@type='submit']"))).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='authnet-card-number']"))) .sendKeys("4111111111111111");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='authnet-card-expiry']"))).sendKeys("04/25");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='authnet-card-cvc']"))).sendKeys("564");
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place order']"))).click();
	}

}
