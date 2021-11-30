package com.appium.fundootest;

import com.appium.fundoo.pages.Login;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class AppiumFundoTest {

    @Test
    public void appiumFundoTest() throws MalformedURLException {
        Login login = new Login();
        login.setUp();
        login.loginOperation();
    }
}
