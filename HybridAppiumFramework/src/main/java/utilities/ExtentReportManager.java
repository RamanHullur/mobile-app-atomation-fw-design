package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static void startReport() {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("reports/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    public static void startTest(String name) { test = extent.createTest(name); }
    public static void logPass(String msg) { test.pass(msg); }
    public static void logFail(String msg, Throwable t) { test.fail(msg).fail(t); }
    public static void logSkip(String msg) { test.skip(msg); }
    public static void flushReport() { extent.flush(); }
}
