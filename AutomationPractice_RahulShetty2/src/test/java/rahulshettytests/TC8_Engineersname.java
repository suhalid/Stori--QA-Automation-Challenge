package rahulshettytests;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

import automationpractice.rahulshetty.pages.AllPages;
import automationpractice.rahulshetty.utils.BaseClass;

/****************************************************************************************************************************************************************
*Created By			: 	Suhali D 		Date: 15-08-2021			
*Last_Updated_by	: 	Suhali D		Date: 15-08-2021
****************************************************************************************************************************************************************/


public class TC8_Engineersname extends BaseClass {

	@Test
	public static void TC8_EngineersName() throws InterruptedException, IOException {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		AllPages lp = new AllPages(driver);

		List<WebElement> EngineersNames = lp.Engineersnames;
		System.out.println("The EngineersNames are");
		for (WebElement EngineersName : EngineersNames) {
			System.out.println(EngineersName.getText());
		}

	}

	@AfterTest
	public void aTest() {
		driver.quit();
	}
}