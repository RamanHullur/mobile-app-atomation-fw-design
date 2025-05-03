package tests;

import io.appium.java_client.AppiumDriver;
import drivers.AppiumDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
    AppiumDriver driver;

    @BeforeClass
    public void setUp() {
        driver = AppiumDriverManager.getDriver();
    }

    @Test
    public void sample() {
        System.out.println("Test running on: " + driver.getPlatformName());
    }

    @AfterClass
    public void tearDown() {
        AppiumDriverManager.quitDriver();
    }
}
