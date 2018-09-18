package pages.booking;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BookingPageObject {

    private SelenideElement getBookButton() {
        return $(By.xpath("//button[@id='bookbtn']"));
    }

    public void scrollToBookButton() {
        getBookButton().scrollTo();
    }

    public ReservationConfirmationPageObject selectBookingButton(){
        getBookButton().click();
        return page(ReservationConfirmationPageObject.class);
    }

}
