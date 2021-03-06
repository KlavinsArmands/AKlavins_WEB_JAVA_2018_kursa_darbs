package pages.header;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.account.AccountPageObject;
import pages.landingpage.LandingPageObject;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $(By.xpath("//nav/descendant::li[@id='li_myaccount']/a"));
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Sign Up')]"));
    }

    private SelenideElement getLogoutButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Logout')]"));
    }

    private SelenideElement getLoginButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Login')]"));
    }

    private SelenideElement getUserAccountButton (String username) {
        return $(By.xpath("//nav/descendant::a[contains(text(), '" + username +  "')]"));
    }

    private SelenideElement getHomeButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Home')]"));
    }

    private SelenideElement getLoadingIndicator() {
        return $(By.id("preloader"));
    }

    private SelenideElement getAccountButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Account')]"));
    }

    private SelenideElement getLogoImageLocation() {
        return $(".navbar-brand img");
    }


    public void selectMyAccountButton(){
        getMyAccountButton().click();
    }

    public SignUpPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(SignUpPageObject.class);
    }

    public LandingPageObject selectLogoutButton() {
        getLogoutButton().click();
        return page(LandingPageObject.class);
    }

    public LoginPageObject selectLoginButton() {
        getLoginButton().click();
        return page(LoginPageObject.class);
    }

    public AccountPageObject selectUserAccountButton(String username) {
        getUserAccountButton(username).click();
        return page(AccountPageObject.class);
    }

    public AccountPageObject selectHomeButton() {
        getHomeButton().click();
        return page(AccountPageObject.class);
    }

    public void waitUntilPageLoadingIsFinished() {
        getLoadingIndicator().waitUntil(Condition.visible, 15000);
        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"),5000);
    }

    public AccountPageObject selectAccountButton() {
        getAccountButton().click();
        return page(AccountPageObject.class);
    }

    public boolean isLogoVisible() {
        return getLogoImageLocation().isDisplayed();
    }

    public boolean isMyAccountButtonVisible () {
        return getMyAccountButton().isDisplayed();
    }


}
