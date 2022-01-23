package page_object_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sign_up_page_object 
{
	public WebDriver driver;
	By try_for_free = By.xpath("//a[@id='signup_link']"); 
	By First_name = By.xpath("//input[@id='UserFirstName-y9LN']");
	By Last_name = By.xpath("//input[@id='UserLastName-g17A']");
	By Job_title = By.xpath("//input[@id='UserTitle-SBdD']");
	By Email = By.xpath("//input[@id='UserEmail-7GYk']");
	By Phone = By.xpath("//input[@id='UserPhone-hg5R']");
	By Company = By.xpath("//input[@id='CompanyName-pv8Z']");
	By Employees = By.xpath("//select[@id='CompanyEmployees-jLbj']");
	By Country = By.xpath("//select[@id='CompanyCountry-3Pnk']");
	By CountryLanguage = By.xpath("//select[@id='CompanyLanguage-bytT']");
	
	public sign_up_page_object(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	public WebElement try_for_free()
	{
		return driver.findElement(try_for_free);
	}
	public WebElement First_name()
	{
		return driver.findElement(First_name);
	}
	public WebElement Last_name()
	{
		return driver.findElement(Last_name);
	}
	public WebElement Job_title()
	{
		return driver.findElement(Job_title);
	}
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	public WebElement Phone()
	{
		return driver.findElement(Phone);
	}
	public WebElement Company()
	{
		return driver.findElement(Company);
	}
	public WebElement Employees()
	{
		return driver.findElement(Employees);
	}
	public WebElement Country()
	{
		return driver.findElement(Country);
	}
	public WebElement CountryLanguage()
	{
		return driver.findElement(CountryLanguage);
	}


}
