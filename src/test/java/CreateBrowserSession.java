import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class CreateBrowserSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        //caps.setCapability("newCommandTimeOut", 300);

        URL url = new URL("http://0.0.0.0:4723");

        switch (platformName) {
            case "Android":
                //caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, "R68T7029JNP");
                //caps.setCapability("avd","Pixel_4");
                //caps.setCapability("avdLaunchTimeout","180000");
                //String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                   //     + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";

                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                //caps.setCapability("chromedriverExecutable", "E:\\Appium\\chromedriver.exe");

                return new AndroidDriver(url, caps);


            case "IOS":



                return new AppiumDriver(url, caps);
            default:
                throw new Exception("invalid platform");
        }
    }
}
