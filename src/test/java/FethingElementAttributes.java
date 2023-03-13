import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FethingElementAttributes {

    public static void main(String[] args) throws Exception {
        //HOW TO FETCH ELEMENT ATTRİBUTES
        AppiumDriver driver = CreateDriverSession.initializeDriver("Android");

        By accessibility = AppiumBy.accessibilityId("Accessibility");
        System.out.println("text:"+driver.findElement(accessibility).getText());
        System.out.println("text:"+driver.findElement(accessibility).getAttribute("text"));
        System.out.println("checked:"+driver.findElement(accessibility).getAttribute("checked"));
        System.out.println("selected:"+driver.findElement(accessibility).getAttribute("selected"));
        System.out.println("selected:"+driver.findElement(accessibility).isSelected());
        System.out.println("enabled:"+driver.findElement(accessibility).isEnabled());


    }
}
