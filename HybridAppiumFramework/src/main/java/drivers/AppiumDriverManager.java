package drivers;

import io.appium.java_client.AppiumDriver;
import config.ConfigManager;

public class AppiumDriverManager {
    private static AppiumDriver driver;

    public static AppiumDriver getDriver() {
        if (driver == null) {
            String platform = ConfigManager.getProperty("platform");
            if ("Android".equalsIgnoreCase(platform)) {
                driver = AndroidDriverConfig.getAndroidDriver();
            } else if ("iOS".equalsIgnoreCase(platform)) {
                driver = IOSDriverConfig.getIOSDriver();
            } else {
                throw new IllegalArgumentException("Unsupported platform: " + platform);
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
