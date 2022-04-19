package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterface.UtestSignUp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class FillForm implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strUserLanguage;
    private String strCity;
    private String strZipPostalCode;
    private String strCountry;
    private String strComputerOs;
    private String strOsVersion;
    private String strComputerLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strMobileOs;
    private String strPassword;

    public FillForm(String strFirstName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear, String strUserLanguage, String strCity, String strZipPostalCode, String strCountry, String strComputerOs, String strOsVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs, String strPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strUserLanguage = strUserLanguage;
        this.strCity = strCity;
        this.strZipPostalCode = strZipPostalCode;
        this.strCountry = strCountry;
        this.strComputerOs = strComputerOs;
        this.strOsVersion = strOsVersion;
        this.strComputerLanguage = strComputerLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strMobileOs = strMobileOs;
        this.strPassword = strPassword;
    }

    public static FillForm thePage(String strFirstName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear, String strUserLanguage, String strCity, String strZipPostalCode, String strCountry, String strComputerOs, String strOsVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs, String strPassword) {
        return Tasks.instrumented(FillForm.class,strFirstName,strLastName,strEmailAddress,strBirthMonth,strBirthDay,strBirthYear,strUserLanguage,strCity,strZipPostalCode,strCountry,strComputerOs,strOsVersion,strComputerLanguage,strMobileDevice,strModel,strMobileOs,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(UtestSignUp.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestSignUp.INPUT_LAST_NAME),
                Enter.theValue(strEmailAddress).into(UtestSignUp.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UtestSignUp.INPUT_MONTH_B),
                SelectFromOptions.byVisibleText(strBirthDay).from(UtestSignUp.INPUT_DAY_B),
                SelectFromOptions.byVisibleText(strBirthYear).from(UtestSignUp.INPUT_YEAR_B),
                Click.on(UtestSignUp.INPUT_LANGUAGE),
                Enter.theValue(strUserLanguage).into(UtestSignUp.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(UtestSignUp.INPUT_LANGUAGE),
                Click.on(UtestSignUp.BUTTON_NEXT_LOCATION),
                Enter.theValue(strCity).into(UtestSignUp.INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(UtestSignUp.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(UtestSignUp.INPUT_CITY),
                Enter.theValue(strZipPostalCode).into(UtestSignUp.INPUT_POSTAL_CODE),
                Click.on(UtestSignUp.BUTTON_NEXT_DEVICES),
                Click.on(UtestSignUp.BUTTON_REMOVE_DATA_PC),
                Click.on(UtestSignUp.BUTTON_DATA_PC),
                Enter.theValue(strComputerOs).into(UtestSignUp.INPUT_DATA_PC),
                Hit.the(Keys.DOWN).keyIn(UtestSignUp.INPUT_DATA_PC),
                Hit.the(Keys.ENTER).keyIn(UtestSignUp.INPUT_DATA_PC),
                Click.on(UtestSignUp.BUTTON_VERSION_PC),
                Enter.theValue(strOsVersion).into(UtestSignUp.INPUT_VERSION_PC),
                Hit.the(Keys.DOWN).keyIn(UtestSignUp.INPUT_VERSION_PC),
                Hit.the(Keys.ENTER).keyIn(UtestSignUp.INPUT_VERSION_PC),
                Click.on(UtestSignUp.BUTTON_LANGUAGE_SO_PC),
                Enter.theValue(strComputerLanguage).into(UtestSignUp.INPUT_LANGUAGE_SO_PC),
                Hit.the(Keys.DOWN).keyIn(UtestSignUp.INPUT_LANGUAGE_SO_PC),
                Hit.the(Keys.ENTER).keyIn(UtestSignUp.INPUT_LANGUAGE_SO_PC),
                Click.on(UtestSignUp.BUTTON_MOBILE_DEVICE),
                Enter.theValue(strMobileDevice).into(UtestSignUp.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.DOWN).keyIn(UtestSignUp.INPUT_MOBILE_DEVICE),
                Hit.the(Keys.ENTER).keyIn(UtestSignUp.INPUT_MOBILE_DEVICE),
                Click.on(UtestSignUp.BUTTON_MODEL_DEVICE),
                Enter.theValue(strModel).into(UtestSignUp.INPUT_MODEL_DEVICE),
                Hit.the(Keys.DOWN).keyIn(UtestSignUp.INPUT_MODEL_DEVICE),
                Hit.the(Keys.ENTER).keyIn(UtestSignUp.INPUT_MODEL_DEVICE),
                Click.on(UtestSignUp.BUTTON_MOBILE_DEVICE_OS),
                Enter.theValue(strMobileOs).into(UtestSignUp.INPUT_MOBILE_DEVICE_OS),
                Hit.the(Keys.DOWN).keyIn(UtestSignUp.INPUT_MOBILE_DEVICE_OS),
                Hit.the(Keys.ENTER).keyIn(UtestSignUp.INPUT_MOBILE_DEVICE_OS),
                Click.on(UtestSignUp.BUTTON_LAST_STEP),
                Enter.theValue(strPassword).into(UtestSignUp.PASSWORD_USER),
                Enter.theValue(strPassword).into(UtestSignUp.PASSWORD_USER_CONFIRMATION),
                Click.on(UtestSignUp.BUTTON_STAY_INFORMED),
                Click.on(UtestSignUp.BUTTON_TERMS),
                Click.on(UtestSignUp.BUTTON_PRIVACY_POLICY),
                Click.on(UtestSignUp.BUTTON_COMPLETE),
                WaitUntil.the(UtestSignUp.COMPLETED_REGISTER, WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds());
    }
}