package Directorysite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Searchprofiles {

	public static void main(String[] args) 
	{

		//Open browser and launch site
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver= new ChromeDriver();
				driver.get("https://patients.staging.innogrp.com");
				
				FluentWait<ChromeDriver> w=new FluentWait<ChromeDriver>(driver);
				w.withTimeout(Duration.ofSeconds(40));
				w.pollingEvery(Duration.ofMillis(1000));
				
				w.until(ExpectedConditions.elementToBeClickable(By.linkText("Provider Directory" ))).click();
				w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Search Profiles']"))).click();
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='directorist-form-element']")))
				.sendKeys("abc");
				WebElement e=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='in_cat']")));
				Select s=new Select(e);
				s.selectByVisibleText("Anesthesiology");
				
				WebElement el=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='in_loc']")));
				Select s1=new Select(el);
				s1.selectByVisibleText("Alberta");
				WebElement dd=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='atbdp-range-slider']/child::div[1]")));
				
				Actions a=new Actions(driver);
				a.dragAndDropBy(dd,562,0).perform();
				
				
				
				
				

				
	}

}
