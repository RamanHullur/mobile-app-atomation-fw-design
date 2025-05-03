package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.ExtentReportManager;

public class TestListener implements ITestListener {
    public void onStart(ITestContext context) { ExtentReportManager.startReport(); }
    public void onFinish(ITestContext context) { ExtentReportManager.flushReport(); }
    public void onTestStart(ITestResult result) { ExtentReportManager.startTest(result.getName()); }
    public void onTestSuccess(ITestResult result) { ExtentReportManager.logPass(result.getName()); }
    public void onTestFailure(ITestResult result) { ExtentReportManager.logFail(result.getName(), result.getThrowable()); }
    public void onTestSkipped(ITestResult result) { ExtentReportManager.logSkip(result.getName()); }
}
