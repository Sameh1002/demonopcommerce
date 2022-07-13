package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P_001 {
    public WebElement navigateToRegistration() {
        return Hooks.driver.findElement(By.linkText("Register"));
    }

    public WebElement selectGender() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public WebElement enterFirstName() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement enterLastName() {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay() {
        return Hooks.driver.findElement(By.cssSelector("select:nth-child(1) > option:nth-child(15)"));
    }

    public WebElement birthMonth() {
        return Hooks.driver.findElement(By.cssSelector("select:nth-child(2) > option:nth-child(10)"));
    }

    public WebElement birthYear() {
        return Hooks.driver.findElement(By.cssSelector("select:nth-child(3) > option:nth-child(16)"));
    }

    public WebElement enterEmail() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement enterPassword() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement register() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public String registrationMessage() {
        return Hooks.driver.findElement(By.cssSelector(".result")).getText();
    }

    public String registrationMessageFont() {
        return Hooks.driver.findElement(By.cssSelector(".result")).getCssValue("color");
    }

}

