package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {

    @Test
    void simplePropertyTest(){
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simpleProperty1Test(){
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simpleProperty2Test(){
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("one_property")
    void simpleProperty4Test(){
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    //gradle clean one_property_test
    //gradle clean one_property_test -Dbrowser=safari

}
