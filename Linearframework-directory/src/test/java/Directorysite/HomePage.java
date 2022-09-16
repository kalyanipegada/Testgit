package Directorysite;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage 
{

	public static void main(String[] args)throws Exception
	{
		//Open browser and launch site
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://directory.dev.innogrp.com");
		Thread.sleep(5000);
        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.xpath("(//input[@placeholder='What are you looking for?' and @name='q'])[2]")).sendKeys("abc");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@placeholder='Location'])[2]")).sendKeys("ABC");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
        
		}


	}


