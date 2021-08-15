package automationpractice.rahulshetty.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	private static ExtentReports extent;

	public synchronized static ExtentReports testReport() {

		String path = System.getProperty("user.dir") + "\\Reports\\index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Stori QA Automation Engineer Challenge Results");
		reporter.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Suhali D");
		return extent;

}
}
