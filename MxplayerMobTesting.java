package Mx;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MXplayerMobTesting extends MXCapabilities {
    AndroidDriver<AndroidElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        driver = mxplayerCapabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void performActions() throws InterruptedException {
        // Launch MX Player app and click on the profile button
        driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/me_tab")).click();

        // Scroll to the network stream button
        driver.findElement(MobileBy.AndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Network Stream\"))"
        )).click();

        // Enter URL in the URL field
        driver.findElement(MobileBy.id("com.mxtech.videoplayer.ad:id/et_url")).sendKeys("Hello, This is my url!");

        Thread.sleep(3000); // Wait for actions to complete
    }

    @Test
    public void openNotificationPanel() throws InterruptedException {
        // Open the notification panel
        new TouchAction<>(driver)
            .press(point(500, 100))
            .waitAction(waitOptions(ofSeconds(2)))
            .moveTo(point(500, 1500))
            .release()
            .perform();

        // Tap on battery saver by coordinates
        new TouchAction<>(driver)
            .tap(point(634, 135))
            .perform();

        Thread.sleep(3000); // Wait for actions to complete
    }

    @Test
    public void switchActivity() throws InterruptedException {
        // Start ApiDemos activity
        driver.startActivity("io.appium.android.apis", "io.appium.android.apis.ApiDemos");

        // Verify the text in the App section
        String txt = driver.findElement(MobileBy.AccessibilityId("App")).getText();
        System.out.println(txt);

        // Switch back to MX Player app
        driver.startActivity("com.mxtech.videoplayer.ad", "com.mxtech.videoplayer.ad.ActivityWelcomeMX");

        // Click on the first ImageView element
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();

        Thread.sleep(3000); // Wait for actions to complete
    }
}
