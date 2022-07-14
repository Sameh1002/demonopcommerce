package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P_002 {

    public WebElement navigateToLogin() {
        return Hooks.driver.findElement(By.linkText("Log in"));
    }

    public WebElement enterMail() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement enterPassword() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginButton() {
        return Hooks.driver.findElement(By.cssSelector(".login-button"));
    }
    public WebElement checkMyaccount() {
        return Hooks.driver.findElement(By.cssSelector(".ico-account"));
    }

    public String url() {
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement checkErrorMessage() {
        return Hooks.driver.findElement(By.cssSelector(".message-error"));
    }

    public String errorMessageFont() {
        return Hooks.driver.findElement(By.cssSelector(".message-error")).getCssValue("color");

    }
}
