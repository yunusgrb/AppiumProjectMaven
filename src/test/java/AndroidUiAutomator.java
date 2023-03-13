import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndroidUiAutomator {
    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        WebElement myElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")"));
        //By myElement1 = AppiumBy.androidUIAutomator("new UiSelector().text(\"Accessibility\")");

        System.out.println("myElement.getText() = " + myElement.getText());

        myElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")")).get(2);
        System.out.println("myElement.getText() = " + myElement.getText());

        myElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().description(\"Accessibility\")")).get(1);
        System.out.println("myElement.getText() = " + myElement.getText());

    }

}
