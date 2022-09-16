package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Signinpage
{
	private RemoteWebDriver driver;
	private FluentWait<RemoteWebDriver>wait;
	
    @FindBy(how=How.XPATH,using="//input[@id='user_login']")
    private WebElement emailaddress;
    
    @FindBy(how=How.XPATH,using="//input[@id='user_pass']")
    private WebElement pwd;
    
    @FindBy(how=How.XPATH,using="//div[@id='login_error']")
    private WebElement unknownemailaddress;
    
    @FindBy(how=How.XPATH,using="//input[@name='rememberme']")
    private WebElement checkbox;
     
     @FindBy(how=How.XPATH,using="//input[@name='redirect_to']")
    private WebElement LOGIN;
    
//Constructor method for connecting runner classes
    
    public void SigninPage(RemoteWebDriver driver, FluentWait<RemoteWebDriver> wait)
    {
    	       PageFactory.initElements(driver, this);
    			this.driver=driver;
    			this.wait=wait;
    }
    //Operational methods to operate elements
    
	public void fillEmail(String x)
	{
		wait.until(ExpectedConditions.visibilityOf(emailaddress)).sendKeys(x);
		
	}
	public void fillpwd(String y)
	{
		wait.until(ExpectedConditions.visibilityOf(pwd)).sendKeys(y);
	}	
	
	
}
		

	


