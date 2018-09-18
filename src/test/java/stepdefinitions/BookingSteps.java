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

    @And("^I confirm the booking$")
    public void iConfirmTheBooking() {
        test.getNavigation().waitUntilPageLoadingIsFinished();
        test.getConfirmationPage().selectConfirmBookingButton();
    }

}
