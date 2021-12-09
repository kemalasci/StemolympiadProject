package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.LocatorsInterface;
import utils.BaseClass;
import utils.Config;



import static pages.InformationClass.url;

public class HomePageFunctionalityStepdefs extends BaseClass implements LocatorsInterface {




    @Given("User should be able to navigate to home Page")
    public void userShouldBeAbleToNavigateToHomePage() {
        Config.maximized = true;
        open(url);

    }

    @When("All links in the home page should be properly defined")
    public void allLinksInTheHomePageShouldBeProperlyDefined() {
        verifyLinks(linkKontrol);
    }

    @Then("All images in the home page should be properly visible")
    public void allImagesInTheHomePageShouldBeProperlyVisible() {
        brokenImages(imageKontrol);
    }

    @And("All buttons should be clickable")
    public void allButtonsShouldBeClickable() {
    }

    @Then("All icons should be clickable")
    public void allIconsShouldBeClickable() {

    }

    @And("All the Headers of the  Footer menus should be confirmed.")
    public void allTheHeadersOfTheFooterMenusShouldBeConfirmed() {
    }
}
