package pages.signup;

import com.codeborne.selenide.SelenideElement;
import pages.account.AccountPageObject;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $("input[name='firstname']");
    }

    private SelenideElement getLastNameField() {
        return $("input[name='lastname']");
    }

    private SelenideElement getMobileNumberField() {
        return $("input[name='phone']");
    }

    private SelenideElement getEmailField() {
        return $("input[name='email']");
    }

    private SelenideElement getPasswordField() {
        return $("input[name='password']");
    }

    private SelenideElement getConfirmPasswordField() {
        return $("input[name='confirmpassword']");
    }

    private SelenideElement getSignUpButtonInPage() {
        return $(".btn-lg");
    }

    public void enterFirstName(String firstname){
        getFirstNameField().sendKeys(firstname);
    }

    public void enterLastName(String lastname){
        getLastNameField().sendKeys(lastname);
    }

    public void enterMobileNumber(String number){
        getMobileNumberField().sendKeys(number);
    }

    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public void enterConfirmPassword(String password){
        getConfirmPasswordField().sendKeys(password);
    }

    public AccountPageObject selectSignUpButtonInPage(){
        getSignUpButtonInPage().click();
        return page(AccountPageObject.class);
    }

}
