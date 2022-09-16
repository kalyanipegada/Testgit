package Directorysite;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddListingsClass
{

	public static void main(String[] args)throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://directory.dev.innogrp.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Add a Doctor']")).click();
		
		//Scenario for login
		driver.findElement(By.linkText("Here")).click();
		try
		{
		driver.findElement(By.xpath("(//input[@class='directorist-form-element'])[2]")).sendKeys("testuser1.70@Example.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password1!");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		}
		catch(Exception exe)
		{
		System.out.println(exe.getMessage());	
		}
	}
		/*driver.findElement(By.linkText(" Recover Password")).click();
		
		//code to Recover password
		driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys("ABC.mail@Example.com");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		//Scenario for sign up
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.id("username")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("abc");
		
		driver.findElement(By.xpath("(//label[@class='directorist-checkbox__label'])[1]")).click();
		driver.findElement(By.xpath("(//label[@class='directorist-checkbox__label'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@name='atbdp_user_submit']")).click();
		
		}*/

}
