package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.LocatorsInterface;
import utils.BaseClass;
import utils.Config;
import static pages.InformationClass.*;
public class RegistrationSupervisorStepdefs extends BaseClass implements LocatorsInterface {


    @When("^Registration should be clickable$")
    public void registrationShouldBeClickable() {
        clickTo(regLogButton);
    }

    @Then("^Supervisor first Sign-up should be clickable$")
    public void supervisorFirstSignUpShouldBeClickable() {
       switcToWindow();
        clickTo(supervisorSingUp);
    }

    @And("^Gaps in the Form tab should be filled$")
    public void gapsInTheFormTabShouldBeFilled() {
        sendKeysTo(firstNameInput, firstName);
        sendKeysTo(lastNameInput, lastName);
        select(phoneNumberTypeSelect, phoneNumberType);
        sendKeysTo(phoneNumber, telNumber);
        clickTo(countrySelect);
        select(countrySelect, countryName);
        sendKeysTo(cityInput, cityName);
        sendKeysTo(school, schoolName);
        select(branchSelect, branceName);
        sendKeysTo(mailInput, Email);
        sendKeysTo(confirmMail, Email);
        sendKeysTo(passwortInput, passwort);
        sendKeysTo(passwortConfirm, passwort);

    }

    @io.cucumber.java.en.Then("^Supervisor last Sign-up should be clickable$")
    public void supervisorLastSignUpShouldBeClickable() {
       clickTo(singUp);

    }


    @And("The second time it should give a Registration error in the Supervisor Registration")
    public void theSecondTimeItShouldGiveARegistrationErrorInTheSupervisorRegistration() {
        verifyElementContainsText(supervisorSingUpErrorMsj,"same email");
    }
}
