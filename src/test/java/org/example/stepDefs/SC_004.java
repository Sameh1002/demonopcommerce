package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_004;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SC_004 {
    P_004 search = new P_004();

    @When("User enter product name or SKU {}")
    public void userEnterProductSearchTerm(String searchTerm) {
        search.goToSearch().sendKeys(searchTerm);
        search.searchButton().click();
    }

    @Then("Items related to search appear")
    public void itemsRelatedToSearchAppear() {
    }

    @Then("Verify URL contains {string}")
    public void verifyURLContains(String exprctedURL) {
        SoftAssert soft = new SoftAssert();
        String actualURL = search.url();
        soft.assertTrue(actualURL.contains(exprctedURL));
        soft.assertAll();
    }

    @And("Count number of search results")
    public void countNumberOfSearches() {
        List<WebElement> searchResults = search.searchResults();
        System.out.println("Number of search results: " + searchResults.size());
    }

    @And("Verify each result contains the search term {}")
    public void verifyEachResultContainsTheSearchTerm(String searchTerm) {
        List<WebElement> searchResultsList = search.searchResults();
        for ( WebElement result : searchResultsList ) {
            Assert.assertTrue(result.getText().toLowerCase().contains(searchTerm.toLowerCase()));
        }
    }

    @Then("Go to the product page")
    public void goToTheProductPage() {
        search.sKUResult().click();
    }

    @And("Verify the product page contains the SKU {}")
    public void verifyTheProductPageContainsTheSKUSearchTerm(String searchResult) {
        System.out.println(searchResult);
        System.out.println(search.sKUProductPage().getText() );
        Assert.assertEquals(searchResult,search.sKUProductPage().getText() );
    }
}
