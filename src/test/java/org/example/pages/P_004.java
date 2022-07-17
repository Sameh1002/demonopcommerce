package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P_004 {

    public WebElement goToSearch() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton() {
        return Hooks.driver.findElement(By.cssSelector(".search-box-button"));
    }

    public String url() {
        return Hooks.driver.getCurrentUrl();
    }

    public List<WebElement> searchResults() {
        return Hooks.driver.findElements(By.cssSelector(".item-box"));
    }

    public WebElement sKUResult() {
        return Hooks.driver.findElement(By.cssSelector(".item-box"));
    }

    public WebElement sKUProductPage() {
        return Hooks.driver.findElement(By.className("sku"));
    }


}
