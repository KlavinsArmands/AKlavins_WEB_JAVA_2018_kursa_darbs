package pages.landingpage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LandingPageObject {

    private SelenideElement getFlightButton() {
        return $("a[href='#flights']");
    }

    private SelenideElement getRoundTripButton() {
        return $("#round").parent();
    }

    private SelenideElement getClassButton() {
        return $("select[name='cabinclass']");
    }

    private SelenideElement getClassOption() {
        return $(By.xpath("//*[@id='flights']/form/div[9]/div[3]/div/select/option[2]"));
    }

    private SelenideElement getFromField() {
        return $("#s2id_location_from input");
    }


    private SelenideElement getToField() {
        return $("#s2id_location_to input");
    }

    private SelenideElement getSearchResult() {
        return $(".select2-result-selectable");
    }

    private SelenideElement getDepartureDate() {
        return $(By.xpath("//input[@name='departure']"));
    }

    private SelenideElement getReturnDate() {
        return $(By.xpath("//input[@name='arrival']"));
    }

    private SelenideElement getPeopleField() {
        return $(By.xpath("//input[@name='totalManualPassenger']"));
    }

    private SelenideElement getAdultField() {
        return $("select[name='madult']");
    }

    private SelenideElement getChildField() {
        return $("select[name='mchildren']");
    }

    private SelenideElement getInfantField() {
        return $("select[name='minfant']");
    }

    private SelenideElement getDoneButton() {
        return $(By.xpath("//*[@id='sumManualPassenger']"));
    }

    private SelenideElement getSearchButton() {
        return $("#flights .search-button button");
    }


    public LandingPageObject selectFlightButton(){
        getFlightButton().click();
        return page(LandingPageObject.class);
    }

    public void selectRoundTripButton(){
        getRoundTripButton().click();
    }

    public void selectClassButton(){
        getClassButton().click();
    }

    public void selectClassOption(){
        getClassOption().click();
    }

    public void enterFromInputField(String fromField){
        getFromField().sendKeys(fromField);
    }

    public void selectSearchResult() {
        getSearchResult().click();
    }

    public void enterToInputField(String toField){
        getToField().sendKeys(toField);
    }

    public void enterDepartureDate(String departure){
        getDepartureDate().sendKeys(departure);
    }

    public void enterReturntDate(String arrival){
        getReturnDate().sendKeys(arrival);
    }

    public void selectPeopleField() {
        getPeopleField().click();
    }

    public void enterAdultAmount(String adult) {
        getAdultField().selectOptionByValue(adult);
    }

    public void enterChildAmount(String child) {
        getChildField().selectOptionByValue(child);
    }

    public void enterInfantmount(String infant) {
        getInfantField().selectOptionByValue(infant);
    }

    public void selectDoneButton(){
        getDoneButton().click();
    }

    public LandingPageObject selectSearchButton(){
        getSearchButton().click();
        return page(LandingPageObject.class);
    }





}
