package com.appium.fundoo.pages;

import com.appium.fundoo.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.jvm.hotspot.utilities.Assert;

public class Login extends Base {

    public void loginOperation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.yml.fundo:id/usernameField")));
        WebElement usernameField = driver.findElement(By.id("com.yml.fundo:id/usernameField"));
        usernameField.sendKeys("saneeth@gmail.com");

        WebElement passwordField = driver.findElement(By.id("com.yml.fundo:id/passwordField"));
        passwordField.sendKeys("sansan11");

        driver.findElement(By.id("com.yml.fundo:id/loginButton")).click();

    }
}
