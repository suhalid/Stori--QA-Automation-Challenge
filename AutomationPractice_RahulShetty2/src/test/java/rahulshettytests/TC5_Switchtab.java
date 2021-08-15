package rahulshettytests;

import java.io.File;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

import automationpractice.rahulshetty.pages.AllPages;
import automationpractice.rahulshetty.utils.BaseClass;

/****************************************************************************************************************************************************************
*Created By			: 	Suhali D 		Date: 15-08-2021			
*Last_Updated_by	: 	Suhali D		Date: 15-08-2021
****************************************************************************************************************************************************************/


public class TC5_Switchtab extends BaseClass {

	@Test
	public void TC5_SwitchTab(Method method) throws Throwable {
		launchBrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		AllPages lp = new AllPages(driver);
		lp.opentabcs.click();
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		WebDriverWait w = new WebDriverWait(driver, 5);
		WebElement viewcours = w
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("viewcorse"))));

		Actions a = new Actions(driver);
		a.moveToElement(viewcours);
		a.perform();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String dt = dtf.format(now);
		String methodname = method.getName();

		this.takeSnapShot(driver, "C:\\Users\\suhal\\workspace\\AutomationPractice_RahulShetty2\\Screenshots\\"
				+ methodname + dt + ".png");

		// switch to parent window
		driver.switchTo().window(newTb.get(0));

	}

	public void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);

	}

	@AfterTest
	public void aTest() {
		driver.quit();
	}
}