package drivers;

import org.openqa.selenium.remote.DesiredCapabilities;
import config.ConfigManager;

public class DeviceCapabilities {

    public static DesiredCapabilities getAndroidCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", ConfigManager.getProperty("android.deviceName"));
        caps.setCapability("platformVersion", ConfigManager.getProperty("android.platformVersion"));
        caps.setCapability("app", ConfigManager.getProperty("android.appPath"));
        caps.setCapability("automationName", "UiAutomator2");
        return caps;
    }

    public static DesiredCapabilities getIOSCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("deviceName", ConfigManager.getProperty("ios.deviceName"));
        caps.setCapability("platformVersion", ConfigManager.getProperty("ios.platformVersion"));
        caps.setCapability("app", ConfigManager.getProperty("ios.appPath"));
        caps.setCapability("automationName", "XCUITest");
        return caps;
    }
}
