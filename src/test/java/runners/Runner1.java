package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import utils.Driver;

@CucumberOptions(

        features = {"src/test/java/features/HomePageFunctionality.feature"},
        glue = {"stepdefs"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Runner1 extends AbstractTestNGCucumberTests {

    @AfterClass
    public void afterSuite(){
        Driver.quitDriver();
        
    }
}
