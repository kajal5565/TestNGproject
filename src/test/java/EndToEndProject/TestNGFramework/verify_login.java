package EndToEndProject.TestNGFramework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Resources.base_class;

import page_object_module.login_page_object;

public class verify_login extends base_class
{
	@Test(dataProvider="Getdata")
	public void Browser_Launch(String username, String password) throws IOException, InterruptedException 
	{
		driver = Driver_initialization();
		driver.get("https://login.salesforce.com/?locale=eu");
		  login_page_object obj = new login_page_object(driver);
		  Thread.sleep(5000);
		  obj.getusername().sendKeys(username);
		  Thread.sleep(5000);
		  obj.getpassword().sendKeys(password);
		  obj.getlogin().click();
		  
	}
	@DataProvider
	public Object[][]Getdata()										//getdata is dataprovider
	{
		Object[][]Get=new Object[2][2];
		Get[0][0]="username1";//username
		Get[0][1]="12345";//password
		Get[1][0]="username2";
		Get[1][1]="5555";
		return Get;
		
	}
}
