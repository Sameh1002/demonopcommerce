package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_007;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class SC_007 {

    P_007 follow = new P_007();
    @When("User clicks on {} link")
    public void userClicksOnSiteNameLink(String siteName) {
        follow.goToFollow(siteName).click();
    }



    @Then("{} is opened in new tab")
    public void urlIsOpenedInNewTab(String expectedURL) {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        String actualURL = follow.url();
        Assert.assertEquals(actualURL.toLowerCase(), expectedURL.toLowerCase());
    }
}
