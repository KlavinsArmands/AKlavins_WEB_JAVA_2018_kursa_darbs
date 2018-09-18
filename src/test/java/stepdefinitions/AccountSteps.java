package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class AccountSteps {

    private TestContext test;

    public AccountSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("^I open invoice for the newest booking$")
    public void iOpenInvoiceForTheNewestBooking() {
        test.getAccountPage().selectInvoiceButton();
    }

}
