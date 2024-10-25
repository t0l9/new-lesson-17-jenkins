package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistarationResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistarationResultsModal registarationResultsModal = new RegistarationResultsModal();

    private final String TITLE_TEXT = "Student Registration Form";

    private final SelenideElement firstNameInput = $("#firstName");
    private final SelenideElement lastNameInput = $("#lastName");
    private final SelenideElement userEmailInput = $("#userEmail");
    private final SelenideElement userSexInput = $("#genterWrapper");
    private final SelenideElement userNumberInput = $("#userNumber");
    private final SelenideElement userHobbiesInput = $("#hobbiesWrapper");
    private final SelenideElement userAdressInput = $("#currentAddress");
    private final SelenideElement userImageInput = $("#uploadPicture");
    private final SelenideElement userStateInput = $("#state");
    private final SelenideElement userCityInput = $("#city");
    private final SelenideElement stateCityWrapper = $("#stateCity-wrapper");
    private final SelenideElement buttonClick = $("#submit");
    private final SelenideElement practiceFormWrapper = $(".practice-form-wrapper");
    private final String urlAdress = "/automation-practice-form";

    public RegistrationPage openPage(){
        open(urlAdress);
        practiceFormWrapper.shouldHave(text(TITLE_TEXT));

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

    public RegistrationPage setHobbies(String value){
        userHobbiesInput.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setAdress(String value){
        userAdressInput.setValue(value);

        return this;
    }

    public RegistrationPage uploadImage(String path){
        userImageInput.uploadFromClasspath(path);

        return this;
    }

    public RegistrationPage selectState(String state){
        userStateInput.click();
        stateCityWrapper.$(byText(state)).click();

        return this;
    }

    public RegistrationPage selectCity(String city){
        userCityInput.click();
        stateCityWrapper.$(byText(city)).click();
        buttonClick.click();

        return this;
    }

    public RegistrationPage selectBirthDay(String[] date){

        calendarComponent.selectDateofBirthday(date[0], date[1], date[2]);

        return this;
    }

    public RegistrationPage verifyModalResult(){
        registarationResultsModal.verifyModalappears();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value){

        registarationResultsModal.verifyResult(key, value);
        return this;
    }
}
