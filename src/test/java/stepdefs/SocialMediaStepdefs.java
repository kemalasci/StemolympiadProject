package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.LocatorsInterface;
import utils.BaseClass;
import utils.Config;

import java.util.List;
import java.util.Set;

import static pages.InformationClass.url;

public class SocialMediaStepdefs extends BaseClass implements LocatorsInterface {






    @Given("open web page")
    public void openWebPage() {
        Config.maximized = true;
        open(url);
    }

    @When("click social media web pages  links")
    public void clickSocialMediaWebPagesLinks() {
        String anaSayfaIDsi = driver.getWindowHandle();

        List<WebElement> linkler = driver.findElements(sacialMediaList);

        for (WebElement link : linkler) {
            link.click();


        }
        Set<String> windowIDler = driver.getWindowHandles();

        for (String ID : windowIDler) {
            if (ID.equals(anaSayfaIDsi)) continue;


            driver.switchTo().window(ID);


            Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("com"));

            driver.close();

        }
        driver.quit();
    }
}
