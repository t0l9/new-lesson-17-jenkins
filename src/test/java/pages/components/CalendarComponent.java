package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent{

    private final SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    private final SelenideElement selectedMonth = $(".react-datepicker__month-select");
    private final SelenideElement selectedYear = $(".react-datepicker__year-select");
    //private final SelenideElement selectedDat = $(".react-datepicker__day.react-datepicker__day--0");

    public void selectDateofBirthday(String day, String month, String year){

        dateOfBirthInput.click();
        selectedMonth.selectOption(month);
        selectedYear.selectOption(year);
        $(".react-datepicker__day.react-datepicker__day--0" + day).click();
    }
}
