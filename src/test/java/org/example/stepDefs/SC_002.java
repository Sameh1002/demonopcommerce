package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_002;
import org.openqa.selenium.support.Color;
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

    @Then("User logins successfully and the page URL is {string}")
    public void userLoginsSuccessfully(String expectedURL) {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "My account";
        String actualResult = login.checkMyaccount().getText();

        String actualURL = login.url();

        soft.assertEquals(actualResult, expectedResult);
        soft.assertEquals(actualURL, expectedURL);
        soft.assertAll();

    }

    @Then("User can't login")
    public void userCanTLogin() {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Login was unsuccessful";
        String actualResult = login.checkErrorMessage().getText();

        String expectedColor = "#e4434b";
        String actualColor = Color.fromString(login.errorMessageFont()).asHex();

        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();
    }

    @Then("User can't login with message {string} in color {string}")
    public void userCanTLoginWithMessageInColor(String expectedResult, String expectedColor) {
        SoftAssert soft = new SoftAssert();
        String actualResult = login.checkErrorMessage().getText();
        String actualColor = Color.fromString(login.errorMessageFont()).asHex();
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();
    }
}
