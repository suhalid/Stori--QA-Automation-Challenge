package rahulshettytests;

import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import automationpractice.rahulshetty.pages.AllPages;
import automationpractice.rahulshetty.utils.BaseClass;

/****************************************************************************************************************************************************************
*Created By			: 	Suhali D 		Date: 15-08-2021			
*Last_Updated_by	: 	Suhali D		Date: 15-08-2021
****************************************************************************************************************************************************************/


public class TC4_Switchwindow extends BaseClass {

	@Test()
	public static void TC4_SwitchWindow() throws Throwable {

		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		AllPages lp = new AllPages(driver);
		lp.openwindow.click();
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				Thread.sleep(1000);
				lp.closepopup.click();
				driver.manage().window().maximize();
				Boolean exp_content = driver.getPageSource().contains("30 day Money Back Guarantee");
				Assert.assertTrue(exp_content);
				driver.close();

			}
		}

	}

	@AfterTest
	public void aTest() {
		driver.quit();
	}
}