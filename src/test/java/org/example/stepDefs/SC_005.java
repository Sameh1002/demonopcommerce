package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_005;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SC_005 {

    P_005 hover = new P_005();
    String randomSubCategory ;

    @When("User select a random category from {string}, {string}, {string}")
    public void userSelectARandomCategoryFrom(String category1, String category2, String category3) {

        String[] categories = new String [] {category1,category2,category3};
        int randomIndexCategory =  new Random().nextInt(categories.length);
        Actions builder = new Actions(Hooks.driver);
        builder.moveToElement(hover.hoverOverACategory(categories[randomIndexCategory])).perform();
    }

    @And("User select a random sub-category from one of the categories and clicks on it")
    public void userSelectARandomSubCategoryFromOneOfTheCategories() {
        List<String> subCat = new ArrayList<>();
        List<WebElement> searchResults = hover.getSubCategories();
        for ( WebElement result : searchResults ) {
            if (!result.getText().equals("")) {
                subCat.add(result.getText());
            }
        }
        String[] objects = subCat.toArray(subCat.toArray(new String[0]));
        String lines11 = objects[0];
        String[] lines99 = lines11.split("\r?\n|\r");
        int randomIndexSubCategory =  new Random().nextInt(lines99.length);
        randomSubCategory = lines99[randomIndexSubCategory] ;
        hover.goToSubCategory((lines99[randomIndexSubCategory])).click();
    }

    @Then("The sub-category title should match the chosen sub-category")
    public void theSubCategoryTitleShouldMatchTheChosenSubCategory() {
        Assert.assertTrue(hover.getTextOfPageTittle().getText().toLowerCase().trim().contains(randomSubCategory.toLowerCase().trim()));
    }
}
