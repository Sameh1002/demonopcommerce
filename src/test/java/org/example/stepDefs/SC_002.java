package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.pages.P_002;
import org.testng.asserts.SoftAssert;


public class SC_002 {

    P_002 login = new P_002();


    @When("User navigates the login page")
    public void userNavigateToLoginPage() {
        login.navigateToLogin().click();
    }

    @And("User enters a valid email {string}")
    public void userEntersAValidEmail(String email) {
        login.enterMail().sendKeys(email);
    }

    @And("User enters a valid password {string}")
    public void userEntersAValidPassword(String password) {
        login.enterPassword().sendKeys(password);
    }

    @And("User click the LOGIN button")
    public void userClickTheLOGINButton() {
        login.loginButton().click();
    }

    @And("User enters an invalid password {string}")
    public void userEntersAnInvalidPassword(String password) {
        login.enterPassword().sendKeys(password);
    }

    @And("User enters an invalid email {string}")
    public void userEntersAnInvalidEmail(String email) {
        login.enterMail().sendKeys(email);
    }

    @Then("User logins successfully")
    public void userLoginsSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "My account";
        String actualResult = login.checkMyaccount().getText();

        String expectedURL = "https://demo.nopcommerce.com/";
        String actualURL = login.url();

        soft.assertEquals(actualResult, expectedResult);
        soft.assertEquals(actualURL, expectedURL);
        soft.assertAll();

    }

    @Then("User can't login")
    public void userCanTLogin() {
    }
}
