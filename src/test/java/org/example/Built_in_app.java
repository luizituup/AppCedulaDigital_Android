package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Built_in_app {

    AppiumDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        //create the object
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("automationName","UiAutomator2");
        caps.setCapability("platformVersion","8.0");
        caps.setCapability("deviceName","emulator-5554");
        //informacion se saca de apk-info
        caps.setCapability("appPackage","com.android.calculator2");
        caps.setCapability("appActivity",".Calculator");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        System.out.println(driver + "Esta corriendo");
    }

    @Test
    public void Click_calculator() throws Exception {
        driver.findElement(By.id("digit_9")).click();
        driver.findElement(By.id("op_mul")).click();
        driver.findElement(By.id("digit_8")).click();
        driver.findElement(By.id("eq")).click();

        //evaluaa el resultado de la operacion con el parametro que se le pasa (28).
        //la evaluacion debe ser en string
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "72");
    }

    @AfterTest
    public void tearDown(){
        if(null != driver){
            driver.quit();
        }
    }

}
