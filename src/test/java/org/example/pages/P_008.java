package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class P_008 {



    public WebElement addItemtoWishlist() {
        return Hooks.driver.findElement(By.cssSelector(".item-box:nth-child(3) .add-to-wishlist-button"));
    }
    public WebElement getMessage() {
        return Hooks.driver.findElement(By.cssSelector(".content"));
    }
    public String getMessageColor() {
        return Hooks.driver.findElement(By.cssSelector(".bar-notification.success")).getCssValue("background-color");
    }

    public WebElement gotoWishlist() {
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public WebElement getQuantity() {
        return Hooks.driver.findElement(By.className("qty-input"));
    }
}
