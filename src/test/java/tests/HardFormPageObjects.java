package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HardFormPageObjects {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void seccessfulRegistrationTest() {

        String name = "Anatoliy";
        String lastName = "Kolyshkin";
        String email = "t0l4ik.kas1@gmail.com";
        String gender = "Male";
        String number = "4545444444";


        registrationPage.openPage()
                .setFirstName(name)
                .setLastName(lastName)
                .setEmail(email)
                .setSex(gender)
                .setNumber(number);

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__day.react-datepicker__day--014").click();

        $("#hobbiesWrapper").$(byText("Sports")).click();

        $("#uploadPicture").uploadFromClasspath("img/1.png");

        $("#currentAddress").setValue("Almaty");

        $("#state").click();
        $("#stateCity-wrapper")
                .$(byText("NCR")).click();

        $("#city").click();
        $("#stateCity-wrapper")
                .$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-content").should(appear);
        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Anatoliy"));

        System.out.println("Secseesful test");

    }
}
