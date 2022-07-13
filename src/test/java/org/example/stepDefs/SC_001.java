package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import org.example.pages.P_001;

public class SC_001 {
    P_001 registration = new P_001();

    @Given("User navigates the registration page")
    public void userNavigatesTheRegistrationPage() {
        registration.navigateToRegistration().click();
    }

    @When("User select gender")
    public void userSelectGender() {
        registration.selectGender().click();
    }

    @And("User enter first name {string}")
    public void userEnterFirstName(String firstName) {
        registration.enterFirstName().sendKeys(firstName);
    }

    @And("User enter last name {string}")
    public void userEnterLastName(String lastName) {
        registration.enterLastName().sendKeys(lastName);
    }

    @And("User select date of birth")
    public void userSelectDateOfBirth() {
        registration.birthDay().click();
        registration.birthMonth().click();
        registration.birthYear().click();

    }

    @And("User enter a valid email address {string}")
    public void userEnterAValidEmailAddress(String email) {
        registration.enterEmail().sendKeys(email);
    }

    @And("User enter a valid password {string}")
    public void userEnterAValidPassword(String password) {
        registration.enterPassword().sendKeys(password);

    }

    @And("User confirm the password {string}")
    public void userConfirmThePassword(String password) {
        registration.confirmPassword().sendKeys(password);
    }

    @And("User click the REGISTER button")
    public void userClickTheREGISTERButton() {
        registration.register().click();
    }

    @Then("User creates a new account")
    public void userCreatesANewAccount() {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Your registration completed";
        String actualResult = registration.registrationMessage();
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualColor = registration.registrationMessageFont();
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertEquals(actualColor, expectedColor);
    }


}
