package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class BookingSteps {

    private TestContext test;

    public BookingSteps(TestContext testContext){
        this.test = testContext;
    }

    @And("^I book the first flight offer available$")
    public void iBookTheFirstFlightOfferAvailable() {
        test.getBookingPage().scrollToBookButton();
        test.getBookingPage().selectBookingButton();
    }


    @And("^I enter first name$")
    public void iEnterFirstName() {
        test.getConfirmationPage().enterFirstName(test.getUser().getFirstName());
    }

    @And("^I enter last name$")
    public void iEnterLastName() {
        test.getConfirmationPage().enterLastName(test.getUser().getLastName());
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        test.getConfirmationPage().enterEmailAddress(test.getUser().getEmailAddress());
    }

    @And("^I confirm email address$")
    public void iConfirmEmailAddress() {
        test.getConfirmationPage().enterEmailConfirmation(test.getUser().getEmailAddress());
    }

    @And("^I enter mobile phone number$")
    public void iEnterMobilePhoneNumber() {
        test.getConfirmationPage().enterMobileNumber(test.getUser().getMobileNumber());
    }

    @And("^I enter Address$")
    public void iEnterAddress() {
        test.getConfirmationPage().enterAddress(test.getUser().getAddress());
    }

    @And("^I set country to ([^\\\"]*)$")
    public void iSetCountryToLatvia(String country) {
        test.getConfirmationPage().selectCountryField();
        test.getConfirmationPage().selectOneCountry(country);
    }

    @And("^I confirm the booking$")
    public void iConfirmTheBooking() {
        test.getConfirmationPage().selectConfirmBookingButton();
        test.getNavigation().waitUntilPageLoadingIsFinished();
    }
}
