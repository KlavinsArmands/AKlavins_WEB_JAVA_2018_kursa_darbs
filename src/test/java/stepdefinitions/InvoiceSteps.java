package stepdefinitions;

import cucumber.api.java.en.Then;
import general.TestContext;

import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceSteps {

    private TestContext test;

    public InvoiceSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Then("^new booking contains correct flight details$")
    public void newBookingContainsCorrectFlightDetails() {
        assertThat(test.getInvoice().isNameVisible(
                test.getUser().getFirstName(), test.getUser().getLastName())).isTrue();
        assertThat(test.getInvoice().isPhoneNumberVisible(test.getUser().getMobileNumber())).isTrue();
        assertThat(test.getInvoice().isFromAirportVisible()).isTrue();
        assertThat(test.getInvoice().isToAirportVisible()).isTrue();
    }

    @Then("^invoice details contain correct data$")
    public void invoiceDetailsContainCorrectData() {
        assertThat(test.getInvoice().isNameVisible(
                test.getUser().getFirstName(), test.getUser().getLastName())).isTrue();
        assertThat(test.getInvoice().isAddressVisible(test.getUser().getAddress())).isTrue();
        assertThat(test.getInvoice().isPhoneNumberVisible(test.getUser().getMobileNumber())).isTrue();
        assertThat(test.getInvoice().isFromAirportVisible()).isTrue();
        assertThat(test.getInvoice().isToAirportVisible()).isTrue();
    }
}
