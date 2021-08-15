package rahulshettytests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import automationpractice.rahulshetty.pages.AllPages;
import automationpractice.rahulshetty.utils.BaseClass;

/****************************************************************************************************************************************************************
*Created By			: 	Suhali D 		Date: 15-08-2021			
*Last_Updated_by	: 	Suhali D		Date: 15-08-2021
****************************************************************************************************************************************************************/


public class TC6_Switchalert extends BaseClass {

	@Test
	public static void TC6_SwitchAlert() throws Throwable {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		AllPages lp = new AllPages(driver);
		lp.switchtab.sendKeys("Stori Card");
		lp.alrtbtn.click();
		String val = driver.switchTo().alert().getText();
		System.out.println("The first alert message is:   " + val);
		driver.switchTo().alert().accept();
		lp.switchtab.sendKeys("Stori Card");
		lp.confirmbtn.click();
		String actual = driver.switchTo().alert().getText();
		System.out.println("The second alert message is:   " + actual);
		String expected = "Hello Stori Card, Are you sure you want to confirm?";
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();

	}

	@AfterTest
	public void aTest() {
		driver.quit();
	}
}