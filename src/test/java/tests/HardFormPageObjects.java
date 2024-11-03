package tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class HardFormPageObjects extends TestBase {

    @Test
    @Tag("delete")
    @DisplayName("сложная форма авторизациии")
    @Owner("Колышкин")
    @Feature("автотоест на форму авторизации")
    void seccessfulRegistrationTest() {

        String name = "Anatoliy";
        String lastName = "Kolyshkin";
        String email = "t0l4ik.kas1@gmail.com";
        String gender = "Male";
        String number = "4545444444";
        String hobbies = "Sports";
        String currentCity = "Almaty";
        String imagePath = "img/1.png";
        String state = "NCR";
        String city = "Delhi";
        String[] date = {"14", "February", "1996"};


        step("Открытие страницы", ()->{
            registrationPage.openPage();
        });

        step("Установка имени ", ()->{
            registrationPage.setFirstName(name);
        });

        step("Установка фамилии ", ()->{
            registrationPage.setLastName(lastName);
        });

        step("Установка email ", ()->{
            registrationPage.setEmail(email);
        });

                registrationPage.setSex(gender)
                .setNumber(number)
                .selectBirthDay(date)
                .setHobbies(hobbies)
                .setAdress(currentCity)
                .uploadImage(imagePath)
                .selectState(state)
                .selectCity(city)
                .verifyModalResult()
                .verifyResult("Student Name", name + " " + lastName);

        System.out.println("Secseesful test motherfuskers");

    }

    @Test
    void openCalendar() {

        String[] date = {"14", "February", "1996"};

        open("/automation-practice-form");
        registrationPage.selectBirthDay(date)
                .setFirstName("Fix");
    }
}
