package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P_003 {


    public WebElement changeCurrency() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public String chooseCurrency() {
        return "Euro";
    }
}
