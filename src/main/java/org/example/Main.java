package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public AppiumDriver driver;
    public AndroidTouchAction actions;
    public WebDriverWait wait;

    public void Init() throws MalformedURLException {
        //create the object
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "8.0");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("session-override", "true");
        caps.setCapability("app", "C:\\Users\\luis.bermudez\\Desktop\\BootCamp\\appOne\\apps\\appdebug0811.apk");

            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
            wait = new WebDriverWait(driver, 15);
            System.out.println(driver + "Esta corriendo");

    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
