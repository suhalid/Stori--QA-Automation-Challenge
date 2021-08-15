package rahulshettytests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import automationpractice.rahulshetty.pages.AllPages;
import automationpractice.rahulshetty.utils.BaseClass;

/****************************************************************************************************************************************************************
*Created By			: 	Suhali D 		Date: 15-08-2021			
*Last_Updated_by	: 	Suhali D		Date: 15-08-2021
****************************************************************************************************************************************************************/


public class TC2_Suggestionclass extends BaseClass {

	@Test
	public static void TC2_SuggestionClass() throws Throwable {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		AllPages lp = new AllPages(driver);
		lp.suggestion_class_input1.sendKeys(prop.getProperty("suggestion_class_data"));
		lp.new2.click();

	}

	@AfterTest
	public void aTest() {
		driver.quit();
	}
}