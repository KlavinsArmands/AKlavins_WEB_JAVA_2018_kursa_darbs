package pages.account;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class AccountPageObject {

    private SelenideElement getInvoiceButton() {
        return $(By.xpath("//*[@id='bookings']/div[2]/div[4]/a[1]"));
    }


    public void selectInvoiceButton() {
        getInvoiceButton().click();
        switchTo().window("Invoice");
    }

}
