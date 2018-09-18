package general;

import lombok.Data;
import pages.account.AccountPageObject;
import pages.booking.BookingPageObject;
import pages.booking.ReservationConfirmationPageObject;
import pages.header.NavigationPageObject;
import pages.invoice.InvoicePageObject;
import pages.landingpage.LandingPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;


@Data
public class TestContext {

    private User user;
    private AccountPageObject accountPage;
    private BookingPageObject bookingPage;
    private ReservationConfirmationPageObject confirmationPage;
    private NavigationPageObject navigation;
    private InvoicePageObject invoice;
    private LandingPageObject landingPage;
    private LoginPageObject loginPage;
    private SignUpPageObject signUpPage;

    public TestContext() {
        this.user = new User();
        this.accountPage = new AccountPageObject();
        this.bookingPage = new BookingPageObject();
        this.confirmationPage = new ReservationConfirmationPageObject();
        this.navigation = new NavigationPageObject();
        this.invoice = new InvoicePageObject();
        this.landingPage = new LandingPageObject();
        this.loginPage = new LoginPageObject();
        this.signUpPage = new SignUpPageObject();

    }

}
