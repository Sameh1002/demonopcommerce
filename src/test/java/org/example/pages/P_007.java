package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P_007 {

    public WebElement goToFollow(String siteName) {
        return Hooks.driver.findElement(By.className(siteName));
    }

    public String url() {
        return Hooks.driver.getCurrentUrl();
    }
}
