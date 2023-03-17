import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AndroidAutomateBrowser {
    public static <JavascriptExecuter> void main(String[] args) throws Exception {

        AppiumDriver driver = CreateBrowserSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.tesla.com/");

        driver.findElement(By.xpath("//*[@id=\"tds-site-header\"]/ol/li/button")).click();
        driver.findElement(AppiumBy.xpath("//*[@id=\"tds-global-menu\"]/dialog/section/ol/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"tesla-hero-3707\"]/div[2]/div/section/div/section/a[2]")).click();

        //WebElement element = driver.findElement(AppiumBy.xpath("//*[@id=\"Model_X_Front_View\"]/image"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Model_X_Front_View\"]/image")));
        Thread.sleep(3000);
        WebElement continueTo = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/div/div[8]/div/div/div[2]/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueTo);
        Thread.sleep(3000);

        scrollMe(driver);


        wait.until(ExpectedConditions.visibilityOf(continueTo));
        System.out.println(wait.until(ExpectedConditions.visibilityOf(continueTo)).getText());
        continueTo.click();
        WebElement orderWithCard = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div/div/div[3]/div/div/div[8]/div/div/div[1]/div[1]/button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderWithCard);
        scrollMe(driver);
        orderWithCard.click();
        scrollMe(driver);
        driver.findElement(By.xpath("//*[@id=\"FIRST_NAME\"]")).sendKeys("Java");
        driver.findElement(By.xpath("//*[@id=\"LAST_NAME\"]")).sendKeys("Appium");


    }

    public static void scrollMe(AppiumDriver driver){

        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 800, "height", 1000,
                // "elementId", ((RemoteWebElement) element).getId(),
                "direction", "up",
                "percent", 1.00
        ));

    }
}

