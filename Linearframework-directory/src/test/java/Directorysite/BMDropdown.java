package Directorysite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BMDropdown 
{

	public static void main(String[] args) throws Exception
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://directory.dev.innogrp.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("All Listings")).click();
		
		WebElement dd=driver.findElement(By.xpath("//*[@id='dropdownMenuLink2']"));
		List<WebElement> items=driver.findElements(By.xpath("//a[@class='dropdown-item ']"));
		
		System.out.println("count of items in dropdown are" + items.size());
		System.out.println("Items are:");
		for(WebElement item:items)
		{
			//Get hidden items text using javaScript
			String x=(String) driver.executeScript("return(arguments[0].textContent);",item);
			System.out.println(x);
			
		}
		//select each visible item and test that selection
		for(WebElement item:items)
		{
			try
			{
		//open drop-down to get visibility of item
				
		 dd.click();
		 Thread.sleep(5000);
		 
		 //Check item for visibility
		 if(item.isDisplayed())
		 {
		 //Remember text of the item to be selected
		  String expected= item.getText();
		  
		 //select that item
		  item.click();
		  Thread.sleep(2000);
		  //Get selected item text
		  String actual=dd.findElement(By.xpath("//a[@class='dropdown-item '][3]")).getText();
		  //compare both remembered text and visible text of selected item
		  if(expected.equals(actual))
		  {
		  System.out.println(expected+"Item selection test passed");
		  }
		  else
		  {
			  System.out.println(expected+"Item selection test failed"); 
			  
		  }
		 }
		 else//item is hidden
		 {
			String y=(String)driver.executeScript("return(arguments[0].textContent);",item);
			System.out.println(y+"Item is hidden");
		 }
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
			
			
		 }
		  
			
		 
		

	}


