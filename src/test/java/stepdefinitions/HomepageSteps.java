package stepdefinitions;

import cucumber.api.java.en.And;
import general.TestContext;

public class HomepageSteps {

    private TestContext test;

    public HomepageSteps(TestContext testContext) {
        this.test = testContext;
    }


    @And("^I select FLIGHTS menu in booking section$")
    public void iSelectFLIGHTSMenuInBookingSection() {
        test.getNavigation().waitUntilPageLoadingIsFinished();
        test.getLandingPage().selectFlightButton();
    }

    @And("^I select ROUND TRIP flight option$")
    public void iSelectROUNDTRIPFlightOption() {
        test.getNavigation().waitUntilPageLoadingIsFinished();
        test.getLandingPage().selectRoundTripButton();
    }

    @And("^I set FIRST class tickets$")
    public void iSetFIRSTClassTickets() {
        test.getLandingPage().selectClassButton();
        test.getLandingPage().selectClassOption();
    }

    @And("^I set ([^\\\"]*) as departure airport$")
    public void iSetRIGAAsDepartureAirport(String fromField){
        test.getLandingPage().enterFromInputField(fromField);
        test.getLandingPage().selectSearchResult();
    }

    @And("^I set ([^\\\"]*) as arrival airport$")
    public void iSetBARCELONAAsArrivalAirport(String toField){
        test.getLandingPage().enterToInputField(toField);
        test.getLandingPage().selectSearchResult();
    }

    @And("^I set ([^\\\"]*) as departure date$")
    public void iSetValidDepartureDate(String departure) {
        test.getLandingPage().enterDepartureDate(departure);
    }

    @And("^I set ([^\\\"]*) as return date$")
    public void iSetValidReturnDate(String arrival){
        test.getLandingPage().enterReturntDate(arrival);
    }

    @And("^I set ([^\\\"]*) adults$")
    public void iSetAdults(String adult) {
        test.getLandingPage().selectPeopleField();
        test.getLandingPage().enterAdultAmount(adult);
    }

    @And("^I set ([^\\\"]*) children$")
    public void iSetChildren(String child) {
        test.getLandingPage().enterChildAmount(child);
    }

    @And("^I set ([^\\\"]*) infant$")
    public void iSetInfant(String infant) {
        test.getLandingPage().enterInfantmount(infant);
        test.getLandingPage().selectDoneButton();
    }

    @And("^I search for a flight$")
    public void iSearchForAFlight() {
        test.getLandingPage().selectSearchButton();
    }

}
