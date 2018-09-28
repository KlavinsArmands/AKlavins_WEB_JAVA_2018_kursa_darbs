package pages.invoice;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InvoicePageObject {

    private SelenideElement getName(String firstName, String lastName) {
        return $(By.xpath("//div[contains(text(), '"+firstName+" "+lastName+"')]"));
    }

    private SelenideElement getAddress(String address) {
        return $(By.xpath("//div[contains(text(), '"+address+"')]"));
    }

    private SelenideElement getPhoneNumber(String number) {
        return $(By.xpath("//div[contains(text(), '"+number+"')]"));
    }

    private SelenideElement getFromAirport(String departure) {
        return $(By.xpath("//table//td[contains(text(), '"+departure+"')]"));
    }

    private SelenideElement getToAirport(String arrival) {
        return $(By.xpath("//table//td[contains(text(), '"+arrival+"')]"));
    }



    public boolean isNameVisible(String firstName, String lastName) {
        return getName(firstName, lastName).isDisplayed();
    }

    public boolean isAddressVisible(String address) {
        return getAddress(address).isDisplayed();
    }

    public boolean isPhoneNumberVisible(String number) {
        return getPhoneNumber(number).isDisplayed();
    }

    public boolean isFromAirportVisible(String departure) {
        return getFromAirport(departure).isDisplayed();
    }

    public boolean isToAirportVisible(String arrival) {
        return getToAirport(arrival).isDisplayed();
    }

}
