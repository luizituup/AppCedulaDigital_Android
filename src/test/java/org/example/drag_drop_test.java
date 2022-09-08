package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;

public class drag_drop_test {

    public AppiumDriver driver;
    public AndroidTouchAction actions;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        //create the object
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("platformVersion","8.0");
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("session-override","true");
        caps.setCapability("app","C:\\Users\\luis.bermudez\\Desktop\\BootCamp\\pruebA\\apps\\ApiDemos.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        System.out.println(driver + "Esta corriendo");
    }

    @Test
    public void drag_drop(){
        List<AndroidElement> views = driver.findElementsByAccessibilityId("Views");

        actions = new AndroidTouchAction(driver);
        actions.tap(ElementOption.element(views.get(0))).perform();

        List<AndroidElement> drag_drop = driver.findElementsByAccessibilityId("Drag and Drop");
        actions.tap(ElementOption.element(drag_drop.get(0))).perform();

        //(AndroidElement) casteo del dato que se recibe
      AndroidElement drag = (AndroidElement) driver.findElement(By.id("drag_dot_1"));

      AndroidElement drop = (AndroidElement) driver.findElement(By.id("drag_dot_2"));
      //presionar de manera extendida
      actions.longPress(ElementOption.element(drag))
              .waitAction().moveTo(ElementOption.element(drop))
              .release()
              .perform();

    }


    @AfterTest
    public void tearDown(){
        if(null != driver){
            driver.quit();
        }
    }
}
