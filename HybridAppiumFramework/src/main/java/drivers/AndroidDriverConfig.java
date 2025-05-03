package drivers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import config.ConfigManager;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverConfig {
    private static AndroidDriver driver;

    public static AndroidDriver getAndroidDriver() {
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = DeviceCapabilities.getAndroidCapabilities();
                driver = new AndroidDriver(new URL(ConfigManager.getProperty("appium.server")), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Invalid Appium Server URL");
            }
        }
        return driver;
    }
}
