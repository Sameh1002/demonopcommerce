package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_003;
import org.openqa.selenium.support.ui.Select;

public class SC_003 {

    P_003 currency = new P_003();
    @When("User selects Euro from dropdown list")
    public void userSelectsEuroFromDropdownList() {
        Select dropdown = new Select(currency.changeCurrency());
        dropdown.selectByVisibleText(currency.chooseCurrency());
    }

    @Then("Prices are changed from US Dollar to Euro")
    public void pricesAreChangedFromUSDollarToEuro() {
    }
}
