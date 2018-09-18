package pages.login;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class LoginPageObject {

    private SelenideElement getEmailAddress() {
        return $("input[name = 'username']");
    }

    private SelenideElement getLoginPassword() {
        return $("input[name = 'password']");
    }

    private SelenideElement getLoginButtonInPage() {
        return $(".btn-lg");
    }

    public void enterEmailAddress(String emailAddress){
        getEmailAddress().sendKeys(emailAddress);
    }

    public void enterLoginPassword(String loginPassword){
        getLoginPassword().sendKeys(loginPassword);
    }

    public AccountPageObject selectLoginButtonInPage(){
        getLoginButtonInPage().click();
        return page(AccountPageObject.class);
    }

}
