package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LocatorsInterface;
import utils.BaseClass;

import java.awt.*;

import static pages.InformationClass.*;

public class SingInStudentUpdateStepdefs extends BaseClass implements LocatorsInterface {
    @When("Student first Registration and Login should be clickable")
    public void studentFirstRegistrationAndLoginShouldBeClickable() {
        clickTo(regLogButton);

    }

    @Then("Student  Sign-in should be clickable")
    public void studentSignInShouldBeClickable() {
        switcToWindow();
        clickTo(signIn);

    }

    @And("Write the Sign in Info of StudentArea in the gaps")
    public void writeTheSignInInfoOfStudentAreaInTheGaps() {
        sendKeysTo(studentNummer, studenNummer);
        sendKeysTo(studentPasswort, passwort);

    }

    @Then("Student last Sign-in should be clickable")
    public void studentLastSignInShouldBeClickable() {
        clickTo(studentSinginLast);
    }

    @And("Should be entered on the student account page")
    public void shouldBeEnteredOnTheStudentAccountPage() {
        waitForVisibilityOf(studentSignInControl);
        verifyElementContainsText(studentSignInControl, "Exams");
    }

    @Then("User should be information update")
    public void userShouldBeInformationUpdate() throws AWTException {
        clickTo(stundentMyProfile);


        clearWithRobotClassSendKeys(schoolNameEditInput, 5, firstName);
        clearWithRobotClassSendKeys(superVisorLastNameInput, 10, lastName);

        clearWithRobotClassSendKeys(superVisorEmailInput, 19, superVisorEmail);
        //clickTo(flag);
        //clickTo(flagDe);
        // clearWithRobotClass(superVisorPhoneNum, 13, superVisorTelNumber);
        select(superVisorPhoneNumSelect, phoneNumberType2);
        clearWithRobotClassSendKeys(superVisorSchool, 5, schoolName);


        clearWithRobotClassSendKeys(superVisorBranch, 7, branceName2);


        clearWithRobotClassSendKeys(firstNameEditInput, 5, firstNameEdit);


        clearWithRobotClassSendKeys(lastNameEditInput, 10, lastNameEdit);


        clearWithRobotClassSendKeys(studentPhoneEditInput, 4, studentPhoneEdit);

        clearWithRobotClassSendKeys(schoolNameEditInput, 5, schoolNameEdit);
        clearWithRobotClassSendKeys(parentEmailEditInput, 15, parentEmail);

        //  clickTo(superVisorUpdate);
        // verifyElementContainsText(SuperVisorUpdateSuccess,"success");
        clickTo(studentUpdate);
        verifyElementContainsText(StudentUpdateSuccess,"success");

    }
}
