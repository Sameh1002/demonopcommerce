package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P_005 {

    public WebElement hoverOverACategory(String randomCategory) {
        return Hooks.driver.findElement(By.linkText(randomCategory));
    }

    public List<WebElement> getSubCategories() {
        return Hooks.driver.findElements(By.className("first-level"));
    }
    public WebElement goToSubCategory(String subcat ) {
        return Hooks.driver.findElement(By.linkText(subcat));
    }
}
