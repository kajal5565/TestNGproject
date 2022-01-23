package page_object_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//just comment for git demo purpose
public class login_page_object
{

	public WebDriver driver;
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@name='Login']");
	
	
	public login_page_object(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);	
	}
	public WebElement getlogin()
	{
		return driver.findElement(login);	
	}
	
}
