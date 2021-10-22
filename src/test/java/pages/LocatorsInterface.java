package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface LocatorsInterface {


    By regLogButton = By.xpath("//span[text()='Registration']");
    By supervisorSingUp = By.xpath("(//button[@class='btn base-button m-0 btn-primary'])[2]");
    By firstNameInput = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[1]");
    By lastNameInput = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[2]");
    By phoneNumberTypeSelect = By.xpath("(//div[@class='d-flex flex-column col-6']//select)[1]");
    By phoneNumber = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[3]");
    By countrySelect = By.xpath("(//div[@class='d-flex flex-column col-6']//select)[2]");
    By cityInput = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[4]");
    By school = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[5]");
    By branchSelect = By.xpath("(//div[@class='d-flex flex-column col-6']//select)[3]");
    By mailInput = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[6]");
    By confirmMail = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[7]");
    By passwortInput = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[8]");
    By passwortConfirm = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[9]");
    By singUp = By.xpath("//button[@class='btn base-button btn-primary']");
    By supervisorSingUpErrorMsj = By.cssSelector("span.text-danger.small.flex-fill");
    By studentSingUp = By.xpath("(//button[@class='btn base-button m-0 btn-primary'])[1]");
    By nextButton = By.xpath("//button[@class='btn base-button btn-primary']");
    By studenFirstName = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[1]");
    By studenLastName = By.xpath("(//input[@class='form-control'])[2]");
    By genderSelect = By.xpath("//div[./*[@class='custom-select' ]][1]//select");
    By studenSchoolName = By.xpath("(//input[@class='form-control'])[3]");
    By gradeSelect = By.xpath("//div[./*[@class='custom-select' ]][2]//select");
    By countrSelect = By.xpath("//div[./*[@class='custom-select' ]][3]//select");
    By studenCity = By.xpath("(//input[@class='form-control'])[4]");
    By studenDateBirth = By.xpath("(//input[@class='form-control'])[5]");
    By studentEmail = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[1]");
    By studentTel = By.xpath("(//input[@class='vti__input form-control '] )[1]");
    By control = By.cssSelector("div>h2.mb-0");
    By studentEmailConfirm = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[2]");
    By studentParentEmail = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[4]");
    By nextButtonStudent = By.xpath("(//div//button[@class='btn base-button btn-primary'])[1]");
    By studentParentEmailConfirm = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[5]");
    By studentParentTel = By.xpath("(//div[@class='d-flex flex-column col-6']//input)[6]");
    By studentParentPhoneNumSelect = By.xpath("(//div[@class='d-flex flex-column col-6']//select)[2]");
    By superVisorTel = By.cssSelector("div>input.vti__input.form-control ");

    By superVisorNameInput = By.xpath("(//input[@class='form-control'])[1]");
    By superVisorLastNameInput = By.xpath("(//input[@class='form-control'])[2]");
    By superVisorEmailInput = By.xpath("(//input[@class='form-control'])[3]");
    By superVisorPhoneNum = By.cssSelector("input.vti__input.form-control.is-invalid");
    By superVisorPhoneNumSelect = By.cssSelector("select.mt-4.custom-select");
    By superVisorSchool = By.xpath("(//input[@class='form-control'])[4]");
    By superVisorBranch = By.xpath("(//input[@class='form-control'])[5]");
    By superVisorUpdate = By.xpath("(//button[@class='btn btn-primary'])[2]");
    By SuperVisorUpdateSuccess = By.xpath("(//div[@class='d-flex small mt-4 col-lg-12'])[1]");
    By studentPass = By.xpath("(//input[@class='form-control'])[1]");
    By studentPassConfirm = By.xpath("(//input[@class='form-control'])[2]");
    By validationErrorControl = By.cssSelector("span.text-danger.flex-fill.small>p.small");
    By linkKontrol = By.cssSelector("a");
    By imageControl = By.tagName("img");
    By buttoControl = By.cssSelector("iframe");
    By signIn = By.xpath("(//button[@class='btn base-button m-0 btn-warning'])[1]");
    By studentNummer = By.xpath("(//input[@class='form-control'])[1]");
    By studentPasswort = By.xpath("(//input[@class='form-control'])[2]");
    By studentSinginLast = By.xpath("(//button[@class='btn base-button btn-primary'])[1]");
    By studentSignInControl = By.cssSelector("a.h4.mb-0.text-white.text-uppercase.d-none.d-lg-inline-block.active.router-link-active     ");
    By stundentMyProfile = By.xpath("(//span[@class='nav-link-text'])[7]");
    By firstNameEditInput = By.xpath("(//input[@class='form-control'])[6]");
    By lastNameEditInput = By.xpath("(//input[@class='form-control'])[7]");
    By studentPhoneEditInput = By.xpath("(//input[@class='vti__input form-control'])[1]");
    By schoolNameEditInput = By.xpath("(//input[@class='form-control'])[10]");
    By parentEmailEditInput = By.xpath("(//input[@class='form-control'])[13]");
    By studentUpdate = By.xpath("(//button[@class='btn btn-primary'])[3]");
    By flag = By.cssSelector("div.vue-tel-input.is-invalid");
    By flagDe = By.xpath("(//div[@class='vti__flag de'])[1]");
    By StudentUpdateSuccess = By.xpath("(//div[@class='d-flex small mt-4 col-lg-12'])[2]");
By sacialMediaList=By.cssSelector("a.u-social-url");
By sampleQuestions=By.xpath("(//a[@class='u-button-style u-custom-color-2 u-nav-link'])[12]");
By syllabus=By.xpath("(//li[@class='u-nav-item'])[14]");
By downloadsampleQuestions=By.cssSelector("p.u-align-left-xl.u-text.u-text");
By aaaaa=By.cssSelector("div>p.u-align-left-xl.u-text.u-text");

}
