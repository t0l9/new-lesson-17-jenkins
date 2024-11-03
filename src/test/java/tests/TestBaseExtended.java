package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.RegistrationPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestBaseExtended {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "126.0";
        Configuration.baseUrl = "https://demoqa.com";

        //Добавляем selenoid для запуска тестов вне
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();
        options.setCapability("selenoid:options", Map.<String, Object>of(
                /* How to enable video recording */
                "enableVideo", true,
                //Включаем окошко в ококшке
                "enableVNC", true
                )
        );

        Configuration.browserCapabilities = capabilities;

    }
}
