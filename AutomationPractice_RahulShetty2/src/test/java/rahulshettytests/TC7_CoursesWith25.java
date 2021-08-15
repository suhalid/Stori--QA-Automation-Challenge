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


public class TC7_CoursesWith25 extends BaseClass {

	@Test
	public static void TC7_CoursesWith$25() throws InterruptedException, IOException {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		AllPages lp = new AllPages(driver);

		List<WebElement> Courses = lp.table25;
		System.out.println("the number of courses that are $25 - " + Courses.size());
		System.out.println("The Courses are");
		for (WebElement Course : Courses) {
			System.out.println(Course.getText());
		}

	}

	@AfterTest
	public void aTest() {
		driver.quit();
	}
}