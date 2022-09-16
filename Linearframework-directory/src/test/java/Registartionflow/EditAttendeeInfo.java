package Registartionflow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditAttendeeInfo extends RegflowwithoutSignin{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://members.staging.innogrp.com");
		FluentWait<ChromeDriver> w=new FluentWait<ChromeDriver>(driver);
		w.withTimeout(Duration.ofSeconds(40));
		w.pollingEvery(Duration.ofMillis(1000));
		
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Edit attendee info']"))).click();
		 
		 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='tribe-tickets__notice__attendee-registration']/following::button"))).click();
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='authnet-card-number']"))) .sendKeys("4111111111111111");
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='authnet-card-expiry']"))).sendKeys("03/45");
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='authnet-card-cvc']"))).sendKeys("321");
		    w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Place order']"))).click();
		    
	
	}

}
