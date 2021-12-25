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

import java.awt.*;
import java.awt.event.KeyEvent;

import static pages.InformationClass.*;

public class RegistrationStudentStepdefs extends BaseClass implements LocatorsInterface {



    @When("Registration should beclickable")
    public void registrationShouldBeclickable() {
        clickTo(regLogButton);
    }

    @Then("Student first Sign-up should be clickable")
    public void studentFirstSignUpShouldBeClickable() {

        switcToWindow();
        clickTo(studentSingUp);
    }

    @And("Gaps in the Student Form tab should be filled")
    public void gapsInTheStudentFormTabShouldBeFilled() {
        clickTo(nextButton);
        sendKeysTo(studenFirstName, firstName);
        sendKeysTo(studenLastName, lastName);
        // clickTo(genderSelect);
        select(genderSelect, gender);
        sendKeysTo(studenSchoolName, schoolName);
        select(gradeSelect, grade);
        select(countrSelect, countryName);
        select(gradeSelect, grade);
        sendKeysTo(studenCity, cityName);
        sendKeysTo(studenDateBirth, studentDateBirth);
        clickTo(nextButton);


        waitForVisibilityOf(studentTel);
        verifyElementContainsText(control, "Contact");
        sendKeysTo(studentEmail, Email2);
        sendKeysTo(studentEmailConfirm, Email2);
        sendKeysTo(studentTel, telNumber);
        select(phoneNumberTypeSelect, phoneNumberType);
        sendKeysTo(studentParentEmail, parentEmail);
        sendKeysTo(studentParentEmailConfirm, parentEmail);
        sendKeysTo(studentParentTel, parentTel);
        clickTo(studentParentPhoneNumSelect);
        select(studentParentPhoneNumSelect, phoneNumberType);
        waitForClickable(nextButtonStudent);
        clickTo(nextButtonStudent);
        waitForVisibilityOf(superVisorTel);
        clickTo(superVisorNameInput);
       // sendKeysTo(superVisorNameInput, lastName);
        //  verifyElementContainsText(control, "Supervisor");

        // sendKeysTo(superVisorLastNameInput, lastName);
        // sendKeysTo(superVisorEmailInput, superVisorEmail);
        // sendKeysTo(superVisorTel, telNumber);
        // select(superVisorPhoneNumSelect, phoneNumberType);
        // sendKeysTo(superVisorSchool, superVisorSchoolName);
        // select(superVisorBranchSelect, superVisorSelect);
        clickTo(nextButtonStudent);

        clickTo(studentPass);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendKeysTo(studentPass, passwort);
        sendKeysTo(studentPassConfirm, passwort);

    }

    @Then("Student last Sign-up should be clickable")
    public void studentLastSignUpShouldBeClickable() {

        clickTo(singUp);


    }



    @And("The second time it should give a Registration error in the Student Registration")
    public void theSecondTimeItShouldGiveARegistrationErrorInTheStudentRegistration() {
        verifyElementContainsText(validationErrorControl, "Errors");
    }
}
