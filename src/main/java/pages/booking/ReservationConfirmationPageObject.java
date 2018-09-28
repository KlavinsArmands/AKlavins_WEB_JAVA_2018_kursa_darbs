package pages.booking;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ReservationConfirmationPageObject {

    private SelenideElement getFirstNameField() {
        return $("input[name='firstname']");
    }

    private SelenideElement getLastNameField() {
        return $("input[name='lastname']");
    }

    private SelenideElement getEmailField() {
        return $("input[name='email']");
    }

    private SelenideElement getConfirmEmailField() {
        return $("input[name='confirmemail']");
    }

    private SelenideElement getMobileNumberField() {
        return $("input[name='phone']");
    }

    private SelenideElement getAddressField() {
        return $("input[name='address']");
    }

    private SelenideElement getCountryField() {
        return $(".select2-chosen");
    }

    private SelenideElement getCountryFieldElement(String country) {
        return $(By.xpath("//div[contains(text(), '" + country + "')]"));
    }

    private SelenideElement getConfirmBookingButton() {
        return $(By.xpath("//button[contains(text(), 'CONFIRM THIS BOOKING')]"));
    }

    public void enterFirstName(String firstname){
        getFirstNameField().sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        getLastNameField().sendKeys(lastname);
    }

    public void enterEmailAddress(String email){
        getEmailField().sendKeys(email);
    }

    public void enterEmailConfirmation(String email){
        getConfirmEmailField().sendKeys(email);
    }

    public void enterMobileNumber(String number){
        getMobileNumberField().sendKeys(number);
    }

    public void enterAddress(String address){
        getAddressField().sendKeys(address);
    }

    public void selectCountryField(){
        getCountryField().click();
    }

    public void selectOneCountry(String country) {
        getCountryFieldElement(country).click();
    }

    public ReservationConfirmationPageObject selectConfirmBookingButton(){
        getConfirmBookingButton().click();
        return page(ReservationConfirmationPageObject.class);
    }

}
