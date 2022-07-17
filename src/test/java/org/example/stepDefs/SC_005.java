package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_005;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SC_005 {

    P_005 hover = new P_005();
    String randomSubCategory ;

    @When("User select a random category from {string}, {string}, {string}")
    public void userSelectARandomCategoryFrom(String category1, String category2, String category3) {

        String[] categories = new String [] {category1,category2,category3};

     //   List<String> subCat = new ArrayList<String>();

        int randomIndexCategory =  new Random().nextInt(categories.length);


        System.out.println("Print random index: " + randomIndexCategory);
        System.out.println("Print the random category: " + categories[randomIndexCategory]);


        Actions builder = new Actions(Hooks.driver);
        builder.moveToElement(hover.hoverOverACategory(categories[randomIndexCategory])).perform();

        List<WebElement> searchResults = hover.getSubCategories();
        System.out.println("The size of the ArrayList is: " + searchResults.size());
        System.out.println("searchResults: "+ searchResults);


//        int i = 0;
//        for ( WebElement result : searchResults ) {
//            //Assert.assertTrue(result.getText().toLowerCase().contains(searchResults.toLowerCase()));
//            System.out.println("i is " + i  );
//            System.out.println(result);
//            i ++;
//            if (!result.getText().equals("")) {
//                subCat.add(result.getText());
//            }
//            //subCat.add(result.getText());
//            System.out.println("result.getText() " + result.getText());
//        }
//        System.out.println("subCat is " +subCat);
//        System.out.println("subCat is "+subCat.getClass());
//        String[] objects = subCat.toArray(subCat.toArray(new String[0]));
//        System.out.println("objects " + objects );
//        System.out.println("0 " + objects[0]);
////        System.out.println("1 " + objects[1]);
////        System.out.println("2 " + objects[2]);
////        System.out.println("3 " + objects[3]);
////        System.out.println("4 " + objects[4]);
////        System.out.println("5 " + objects[5]);
//
//
//        String lines11 = objects[0];
//        System.out.println("lines11 " + lines11);
//
//        String[] lines99 = lines11.split("\r?\n|\r");
//        System.out.println("lines99 0 " + lines99[0]);
//        System.out.println("lines99 1 " + lines99[1]);
//        System.out.println("lines99 2 " + lines99[2]);
//
//        int randomIndexSubCategory =  new Random().nextInt(lines99.length);
//        //Hooks.driver.findElement(By.linkText(lines99[randomIndexSubCategory])).click();
//        hover.goToSubCategory((lines99[randomIndexSubCategory])).click();
//
////        lines11 = lines11.replace("[","");
////        lines11 = lines11.replace("]","");
////        System.out.println("lines11 v2 " + lines11);
////        System.out.println(lines11[0]);
//
//
//
////
////        ArrayList<String> list22 = new ArrayList<String>();
////        for (String s : objects) {
////            if (!s.equals("")) {
////                list22.add(s);
////            }
////        }
////        System.out.println(list22);
////        String lines11 = list22.toString();
////        System.out.println("lines11 " + lines11);
////        lines11 = lines11.replace("[","");
////        lines11 = lines11.replace("]","");
////        System.out.println("lines11 v2 " + lines11);
////
////        String[] lines99 = lines11.split("\r?\n|\r");
////        System.out.println(Arrays.asList(lines99));
////        System.out.println(lines99[0]);
////        System.out.println(lines99[1]);
////        System.out.println(lines99[2]);
////        Hooks.driver.findElement(By.linkText(lines99[1])).click();
////        Hooks.driver.findElement(By.linkText("Notebooks")).click();
////        WebElement element = Hooks.driver.findElement(By.linkText(categories[randomIndex]));
////        System.out.println(element.getText());

    }

    @And("User select a random sub-category from one of the categories and clicks on it")
    public void userSelectARandomSubCategoryFromOneOfTheCategories() {
        List<String> subCat = new ArrayList<>();

        List<WebElement> searchResults = hover.getSubCategories();
        System.out.println("The size of the ArrayList is: " + searchResults.size());
        System.out.println("searchResults: "+ searchResults);


        int i = 0;
        for ( WebElement result : searchResults ) {
            //Assert.assertTrue(result.getText().toLowerCase().contains(searchResults.toLowerCase()));
            System.out.println("i is " + i  );
            System.out.println(result);
            i ++;
            if (!result.getText().equals("")) {
                subCat.add(result.getText());
            }
            //subCat.add(result.getText());
            System.out.println("result.getText() " + result.getText());
        }
        System.out.println("subCat is " +subCat);
        System.out.println("subCat is "+subCat.getClass());
        String[] objects = subCat.toArray(subCat.toArray(new String[0]));
        System.out.println("objects " + Arrays.toString(objects));
        System.out.println("0 " + objects[0]);
//        System.out.println("1 " + objects[1]);
//        System.out.println("2 " + objects[2]);
//        System.out.println("3 " + objects[3]);
//        System.out.println("4 " + objects[4]);
//        System.out.println("5 " + objects[5]);


        String lines11 = objects[0];
        System.out.println("lines11 " + lines11);

        String[] lines99 = lines11.split("\r?\n|\r");
        System.out.println("lines99 0 " + lines99[0]);
        System.out.println("lines99 1 " + lines99[1]);
        System.out.println("lines99 2 " + lines99[2]);

        int randomIndexSubCategory =  new Random().nextInt(lines99.length);
        //Hooks.driver.findElement(By.linkText(lines99[randomIndexSubCategory])).click();
        randomSubCategory = lines99[randomIndexSubCategory] ;
        hover.goToSubCategory((lines99[randomIndexSubCategory])).click();

//        lines11 = lines11.replace("[","");
//        lines11 = lines11.replace("]","");
//        System.out.println("lines11 v2 " + lines11);
//        System.out.println(lines11[0]);



//
//        ArrayList<String> list22 = new ArrayList<String>();
//        for (String s : objects) {
//            if (!s.equals("")) {
//                list22.add(s);
//            }
//        }
//        System.out.println(list22);
//        String lines11 = list22.toString();
//        System.out.println("lines11 " + lines11);
//        lines11 = lines11.replace("[","");
//        lines11 = lines11.replace("]","");
//        System.out.println("lines11 v2 " + lines11);
//
//        String[] lines99 = lines11.split("\r?\n|\r");
//        System.out.println(Arrays.asList(lines99));
//        System.out.println(lines99[0]);
//        System.out.println(lines99[1]);
//        System.out.println(lines99[2]);
//        Hooks.driver.findElement(By.linkText(lines99[1])).click();
//        Hooks.driver.findElement(By.linkText("Notebooks")).click();
//        WebElement element = Hooks.driver.findElement(By.linkText(categories[randomIndex]));
//        System.out.println(element.getText());


    }


    @Then("The sub-category title should match the chosen sub-category")
    public void theSubCategoryTitleShouldMatchTheChosenSubCategory() {
        System.out.println(hover.getTextOfPageTittle().getText().toLowerCase().trim());
        System.out.println(randomSubCategory);
        Assert.assertTrue(hover.getTextOfPageTittle().getText().toLowerCase().trim().contains(randomSubCategory.toLowerCase().trim()));
    }
}
