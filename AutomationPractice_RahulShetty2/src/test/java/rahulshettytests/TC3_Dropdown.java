package rahulshettytests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import automationpractice.rahulshetty.pages.AllPages;
import automationpractice.rahulshetty.utils.BaseClass;

/****************************************************************************************************************************************************************
*Created By			: 	Suhali D 		Date: 15-08-2021			
*Last_Updated_by	: 	Suhali D		Date: 15-08-2021
****************************************************************************************************************************************************************/


public class TC3_Dropdown extends BaseClass {

	@Test
	public static void TC3_dropdown() throws Throwable {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		AllPages lp = new AllPages(driver);
		lp.option2.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		lp.option3.click();

	}

	@AfterTest
	public void aTest() {
		driver.quit();
	}
}