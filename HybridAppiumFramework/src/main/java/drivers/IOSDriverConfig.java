package drivers;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import config.ConfigManager;
import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriverConfig {
    private static IOSDriver driver;

    public static IOSDriver getIOSDriver() {
        if (driver == null) {
            try {
                DesiredCapabilities capabilities = DeviceCapabilities.getIOSCapabilities();
                driver = new IOSDriver(new URL(ConfigManager.getProperty("appium.server")), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Invalid Appium Server URL");
            }
        }
        return driver;
    }
}
