package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import general.TestContext;


public class HeaderSteps {

    private TestContext test;

    public HeaderSteps(TestContext testContext){
        this.test = testContext;
    }

    @Given("^I have an existing account$")
    public void iHaveAnExistingAccount() {
        test.getNavigation().selectMyAccountButton();
        test.getNavigation().selectSignUpButton();
        test.getSignUpPage().enterFirstName(test.getUser().getFirstName());
        test.getSignUpPage().enterLastName(test.getUser().getLastName());
        test.getSignUpPage().enterMobileNumber(test.getUser().getMobileNumber());
        test.getSignUpPage().enterEmail(test.getUser().getEmailAddress());
        test.getSignUpPage().enterPassword(test.getUser().getPassword());
        test.getSignUpPage().enterConfirmPassword(test.getUser().getPassword());
        test.getSignUpPage().selectSignUpButtonInPage();
        test.getNavigation().selectHomeButton();
        test.getNavigation().selectUserAccountButton(test.getUser().getFirstName());
        test.getNavigation().selectLogoutButton();
    }

    @When("^I login this account$")
    public void iLoginThisAccount() {
        test.getNavigation().selectHomeButton();
        test.getNavigation().selectMyAccountButton();
        test.getNavigation().selectLoginButton();
        test.getLoginPage().enterEmailAddress(test.getUser().getEmailAddress());
        test.getLoginPage().enterLoginPassword(test.getUser().getPassword());
        test.getLoginPage().selectLoginButtonInPage();
    }

    @And("^I navigate to Home page$")
    public void iNavigateToHomePage() {
        test.getNavigation().waitUntilPageLoadingIsFinished();
        test.getNavigation().selectHomeButton();
    }

    @And("^I navigate to Accounts page$")
    public void iNavigateToAccountsPage(){
        test.getNavigation().selectUserAccountButton(test.getUser().getFirstName());
        test.getNavigation().selectAccountButton();
    }

}
