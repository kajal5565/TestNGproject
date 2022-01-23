package EndToEndProject.TestNGFramework;

import java.io.IOException;

import com.Resources.base_class;

import page_object_module.sign_up_page_object;

public class verify_sign_up extends base_class
{
	public void Try_For_Free() throws IOException
	{
		driver = Driver_initialization();
		driver.get("https://login.salesforce.com/?locale=eu");
		sign_up_page_object obj = new sign_up_page_object(driver);
		
		
	}
}
