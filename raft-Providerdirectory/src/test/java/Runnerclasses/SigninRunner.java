package Runnerclasses;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegwithoutSigninpage;
import pages.Signinpage;

public class SigninRunner {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://members.staging.innogrp.com");
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(40));
		wait.pollingEvery(Duration.ofMillis(1000));
//Call methods from page class
		Signinpage obj2 =new Signinpage (driver,wait);
        obj2.fillEmail("testuser1.70@Example.com");
        obj2.fillpwd("Password1!");
       
        
        
	}

}
