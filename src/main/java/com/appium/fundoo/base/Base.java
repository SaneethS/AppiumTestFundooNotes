package com.appium.fundoo.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static AndroidDriver driver;
    public static WebDriverWait wait;
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10.0");
        cap.setCapability("appPackage", "com.yml.fundo");
        cap.setCapability("appActivity", "com.yml.fundo.ui.MainActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        wait = new WebDriverWait(driver,20);
        System.out.println("current time:"+driver.getDeviceTime());
        System.out.println("Fundoo App Launched");
    }
}
