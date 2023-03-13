import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionUsingOptions {

    public static void main(String[] args) throws MalformedURLException {

        String appUrl = "C:\\Users\\Mehmet\\IdeaProjects\\AppiumProjectMaven\\src\\main\\resources\\ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options().setDeviceName("Pixel_4")
                .setAutomationName("UiAutomator2")
                .setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url, options);

    }
}
