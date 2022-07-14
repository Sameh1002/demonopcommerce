package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P_003 {


    public WebElement changeCurrency() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public String currencyName() {
        return "Euro";
    }
    public String currencySymbol() {
        return "€";
    }

    public List<WebElement> checkCurrencySignOnFrontpage() {
        return Hooks.driver.findElements(By.cssSelector(".product-item"));
    }

}
