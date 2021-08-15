package automationpractice.rahulshetty.utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import automationpractice.rahulshetty.utils.ExtentReportNG;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {

ExtentTest test;
ThreadLocal <ExtentTest> extentTest = new ThreadLocal<ExtentTest> ();
String passMessage="Test is passed";
ExtentReports extent=ExtentReportNG.testReport();
public void onTestStart(ITestResult result) {
// TODO Auto-generated method stub
test=extent.createTest(result.getMethod().getMethodName());
extentTest.set(test);

}


public void onTestSuccess(ITestResult result) {
// TODO Auto-generated method stub

extentTest.get().log(Status.PASS, passMessage);
}


public void onTestFailure(ITestResult result) {
// TODO Auto-generated method stub
extentTest.get().log(Status.FAIL, result.getThrowable());
//WebDriver driver=null;
String mName=result.getMethod().getMethodName();
/*try {
driver= (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
} catch (Exception e) {
// TODO Auto-generated catch block

}*/
try {
extentTest.get().addScreenCaptureFromPath(getScreenshot(mName, driver), mName);

} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} 


}


public void onTestSkipped(ITestResult result) {
// TODO Auto-generated method stub

}


public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
// TODO Auto-generated method stub

}


public void onTestFailedWithTimeout(ITestResult result) {
// TODO Auto-generated method stub

}


public void onStart(ITestContext context) {
// TODO Auto-generated method stub

}


public void onFinish(ITestContext context) {
// TODO Auto-generated method stub
extent.flush();
}

}
