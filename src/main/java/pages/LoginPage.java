package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement usernameInputField = $(byId("user-name"));
    public SelenideElement passwordInputField = $(byId("password"));
    public SelenideElement loginButton = $(byId("login-button"));

    public SelenideElement alarmMessageLockedOutUser= $(byText("Sorry, this user has been locked out."));

    public SelenideElement alarmMessageInvalidData= $(byText("Username and password do not match any user in this service"));


}
