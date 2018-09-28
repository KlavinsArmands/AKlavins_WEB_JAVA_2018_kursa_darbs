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

    private SelenideElement getFromAirport() {
        return $(By.xpath("//*[@id='invoiceTable']/tbody/tr[4]/td/table[1]/tbody/tr[2]/td/table[2]/tbody/tr[2]/td[3]"));
    }

    private SelenideElement getToAirport() {
        return $(By.xpath("//*[@id='invoiceTable']/tbody/tr[4]/td/table[1]/tbody/tr[2]/td/table[2]/tbody/tr[3]/td[3]"));
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

    public boolean isFromAirportVisible() {
        return getFromAirport().isDisplayed();
    }

    public boolean isToAirportVisible() {
        return getToAirport().isDisplayed();
    }

}
