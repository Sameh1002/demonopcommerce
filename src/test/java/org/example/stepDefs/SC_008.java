package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_008;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class SC_008 {
    P_008 wishlist = new P_008();

    @Given("User add an item to wishlist by clicking the heart symbol")
    public void userAddAnItemToWishlistByClickingTheHeartSymbol() {
        wishlist.addItemtoWishlist().click();
    }

    @Then("The message {string} appears, with background color {string}")
    public void theMessageAppearsWithBackgroundColor(String expectedMessage, String expectedColor) {
        SoftAssert soft = new SoftAssert();
        String actualMessage = wishlist.getMessage().getText();
        String actualColor = wishlist.getMessageColor();
        soft.assertEquals(actualMessage.toLowerCase(), expectedMessage.toLowerCase());
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();
    }

    @When("User waits after adding the item to his wishlist")
    public void userWaitsAfterAddingTheItemToHisWishlist() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        //waiting for the success message to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bar-notification")));

        //waiting for the success message to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("bar-notification")));
    }

    @And("User navigates to his wishlist")
    public void userNavigatesToHisWishlist() {
        wishlist.gotoWishlist().click();
    }

    @Then("The quantity value is bigger than 0")
    public void theQuantityValueIsBiggerThan() {
        String value = wishlist.getQuantity().getAttribute("value");
        Assert.assertNotSame(value, "0");
    }
}
