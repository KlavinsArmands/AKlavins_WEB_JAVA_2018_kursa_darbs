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
        assertThat(test.getInvoice().getFromAirportText()).isEqualTo("Riga Arpt");
        assertThat(test.getInvoice().getToAirportText()).isEqualTo("Barcelona Arpt");
    }

}
