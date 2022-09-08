package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Scroll_Android_Test {
    public AppiumDriver driver;
    //variable de touch
    public AndroidTouchAction actions;


    @BeforeTest
    public void setUp() throws MalformedURLException {
        //create the object
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "8.0");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("session-override", "true");
        caps.setCapability("app", "C:\\Users\\luis.bermudez\\Desktop\\BootCamp\\pruebA\\apps\\ApiDemos.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        System.out.println(driver + "Esta corriendo");
    }

    private void ScrollDown() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.8);
        //0.1 cantidad de veces que realizar el scroll
        int scrollEnd = (int) (dimension.getHeight() * 0.3);

        actions = new AndroidTouchAction(driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release()
                .perform();
    }

    @Test
    public void scroll_test() {
        // creacion de objeto basado en el elemento android
        List<AndroidElement> views = driver.findElementsByAccessibilityId("Views");

        //TAP
        actions = new AndroidTouchAction(driver);
        //validando que el objeto llega diferente de vacio y diferente de null
        if (!views.isEmpty() && views.get(0) != null)
            //posicion 0 de la lista que llega
            actions.tap(ElementOption.element(views.get(0))).perform();

        //Scroll Down
        ScrollDown();
        List<AndroidElement> lists = driver.findElementsByAccessibilityId("Lists");
        //validando que el objeto llega diferente de vacio y diferente de null
        if (!lists.isEmpty() && lists.get(0) != null)
            //posicion 0 de la lista que llega
            actions.tap(ElementOption.element(lists.get(0))).perform();
    }

    @AfterTest
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }

}
