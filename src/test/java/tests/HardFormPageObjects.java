package tests;


import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class HardFormPageObjects extends TestBase {

    @Test
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


        registrationPage.openPage()
                .setFirstName(name)
                .setLastName(lastName)
                .setEmail(email)
                .setSex(gender)
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
