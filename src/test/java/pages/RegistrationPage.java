package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private final String TITLE_TEXT = "Student Registration Form";

    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement userEmailInput = $("#userEmail");
    private final SelenideElement userSexInput = $("#genterWrapper");
    private final SelenideElement userNumberInput = $("#userNumber");

    public RegistrationPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('#footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value){
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage setSex(String value){
        userSexInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setNumber(String value){
        userNumberInput.setValue(value);
        return this;

    }
}
