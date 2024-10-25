package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistarationResultsModal {

    private final String SECSESSFUL_MESSAGE = "Thanks for submitting the form";
    private final SelenideElement modalContent = $(".modal-content");
    private final SelenideElement modalTitle = $(".modal-title");
    private final SelenideElement tableResponsive = $(".table-responsive");

    public void verifyModalappears(){
        modalContent.should(appear);
        modalTitle.shouldHave(text(SECSESSFUL_MESSAGE));
    }

    public void verifyResult(String key, String value){

        tableResponsive.$(byText(key)).parent()
                .shouldHave(text(value));
    }
}
