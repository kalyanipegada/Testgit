package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class ProviderDirectorypage 
{
	private RemoteWebDriver driver;
	private FluentWait<RemoteWebDriver>wait;
    @FindBy(how=How.LINK_TEXT,using="Provider Directory ")
    private WebElement directory;
    
    @FindBy(how=How.XPATH,using="//a[text()=' Search Profiles']")
    private WebElement search;
    
    @FindBy(how=How.XPATH,using="//input[@class='directorist-form-element']")
    private WebElement searchfor;
    

    @FindBy(how=How.XPATH,using="//select[@name='in_cat']")
    private WebElement category;
    
    @FindBy(how=How.XPATH,using="//select[@name='in_loc']")
    private WebElement location;
    
   //Constructor method for connecting runner classes
    
    public ProviderDirectorypage(RemoteWebDriver driver, FluentWait<RemoteWebDriver> wait)
    {
    	    			PageFactory.initElements(driver, this);
    			this.driver=driver;
    			this.wait=wait;
    }
    //Operational methods to operate elements
    public void clickpd()
    {
    	wait.until(ExpectedConditions.visibilityOf(directory)).click();
    }
    public void clickSearch()
    { 
    	wait.until(ExpectedConditions.visibilityOf(search)).click();
    }
    public void Search()
    { 
    	wait.until(ExpectedConditions.elementToBeClickable(searchfor)).click();
    }
    public void selectcategory()
    { 
    	 WebElement e=wait.until(ExpectedConditions.elementToBeClickable(category));
    	Select s=new Select(e);
    	s.selectByVisibleText("Anesthesiology");
    	
    }
    public void selectLocation()
    { 
    	 WebElement e1=wait.until(ExpectedConditions.elementToBeClickable(location));
    	Select s=new Select(e1);
    	s.selectByVisibleText("Alberta");
    	
    }
    
} 	
   
    	
    


