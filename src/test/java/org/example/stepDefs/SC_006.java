package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_006;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SC_006 {

    P_006 slider =new P_006();

    @When("User click on {}")
    public void userClickOnSlider(int slideNumber) {
        slider.getImage(slideNumber).click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("Page change to product page {}")
    public void pageChangeToProductPageProductPage(String expectedURL) {
        SoftAssert soft = new SoftAssert();
        String actualURL = slider.getExpectedURL();
        soft.assertEquals(actualURL, expectedURL);
        soft.assertAll();
    }
}
