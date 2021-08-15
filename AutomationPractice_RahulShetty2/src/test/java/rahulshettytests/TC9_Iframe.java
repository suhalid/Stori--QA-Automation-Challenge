package rahulshettytests;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

import automationpractice.rahulshetty.pages.AllPages;
import automationpractice.rahulshetty.utils.BaseClass;

/****************************************************************************************************************************************************************
*Created By			: 	Suhali D 		Date: 15-08-2021			
*Last_Updated_by	: 	Suhali D		Date: 15-08-2021
****************************************************************************************************************************************************************/


public class TC9_Iframe extends BaseClass {

	@Test
	public static void TC9_IFrame() throws InterruptedException, IOException {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		AllPages lp = new AllPages(driver);

		WebElement Iframe = lp.IFrame;
		driver.switchTo().frame(Iframe);
		String Text = lp.text.getText();
		System.out.println("Text highlighted in blue is:  " + Text);
		driver.switchTo().defaultContent();
	}

	@AfterTest
	public void aTest() {
		driver.quit();
	}
}