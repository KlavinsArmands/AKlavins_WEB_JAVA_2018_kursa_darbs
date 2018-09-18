package pages.invoice;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InvoicePageObject {

    private SelenideElement getFromAirport() {
        return $(By.xpath("//*[@id='invoiceTable']/tbody/tr[3]/td/table/tbody/tr[2]/td/table[1]/tbody/tr[2]/td[3]"));
    }

    private SelenideElement getToAirport() {
        return $(By.xpath("//*[@id='invoiceTable']/tbody/tr[3]/td/table/tbody/tr[2]/td/table[1]/tbody/tr[3]/td[3]"));
    }


    public String getFromAirportText() {
        return getFromAirport().getText();
    }

    public String getToAirportText() {
        return getToAirport().getText();
    }

}
