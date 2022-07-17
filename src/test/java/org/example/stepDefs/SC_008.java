package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_008;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
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

        System.out.println(actualMessage.toLowerCase());
        System.out.println(expectedMessage.toLowerCase());
        System.out.println(actualColor);
        System.out.println(expectedColor);
        soft.assertEquals(actualMessage.toLowerCase(),expectedMessage.toLowerCase());
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();

    }

    @When("User waits after adding the item to his wishlist")
    public void userWaitsAfterAddingTheItemToHisWishlist() throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait((Hooks.driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".content")));
       // WebElement firstResult = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10)) .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
        //System.out.println("11");
     //   Thread.sleep(1);
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
//        System.out.println("15");
//        System.out.println(Hooks.driver.findElement(By.cssSelector(".success")).getText());
//        System.out.println(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".success")));
        //System.out.println(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".success")).getClass());

        System.out.println("first"  + Hooks.driver.findElement(By.id("bar-notification")).getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bar-notification")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("bar-notification")));

        System.out.println(ExpectedConditions.invisibilityOfElementLocated(By.id("bar-notification")));
        //System.out.println(Hooks.driver.findElement(By.id("bar-notification")));
        //System.out.println(Hooks.driver.findElement(By.cssSelector(".success")).getText());
        System.out.println("12");

        Thread.sleep(5000);
        //System.out.println(Hooks.driver.findElement(By.cssSelector(".success")).getText());
        System.out.println("last " + Hooks.driver.findElement(By.id("bar-notification")).getText());


        System.out.println("13");
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".bar-notification.success")));


    }


//        @When("User waits after adding the item to his wishlist")
//        public void userWaitsAfterAddingTheItemToHisWishlist() throws InterruptedException {
//            Thread.sleep(10000);
//        }

    @And("User navigates to his wishlist")
    public void userNavigatesToHisWishlist() {
        wishlist.gotoWishlist().click();
    }

    @Then("The quantity value is bigger than 0")
    public void theQuantityValueIsBiggerThan() {
        String value = wishlist.getQuantity().getAttribute("value");
        System.out.println(value);
        Assert.assertNotSame (value, "0" );
    }
}
