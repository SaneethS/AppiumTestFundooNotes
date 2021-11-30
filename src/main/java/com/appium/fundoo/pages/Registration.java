package com.appium.fundoo.pages;

import com.appium.fundoo.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Registration extends Base {

    public void registerOperation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.yml.fundo:id/registerLink")));
        driver.findElement(By.id("com.yml.fundo:id/registerLink")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.yml.fundo:id/registerName")));
        driver.findElement(By.id("com.yml.fundo:id/registerName")).sendKeys("testl400");

        driver.findElement(By.id("com.yml.fundo:id/registerEmail")).sendKeys("testl400@gmail.com");

        driver.findElement(By.id("com.yml.fundo:id/registerPassword")).sendKeys("testtest");

        driver.findElement(By.id("com.yml.fundo:id/registerConfirmPassword")).sendKeys("testtest");

        driver.findElement(By.id("com.yml.fundo:id/registerMobile")).sendKeys("8872766371");

        driver.findElement(By.id("com.yml.fundo:id/registerButton")).click();
    }
}
