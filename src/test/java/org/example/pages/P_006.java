package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P_006 {


    public WebElement getImage(int slideNumber) {
        return Hooks.driver.findElement(By.cssSelector(String.format(".nivo-imageLink:nth-child(%d)", slideNumber)) );
    }

    public String getExpectedURL() {
        return Hooks.driver.getCurrentUrl();
    }
}
