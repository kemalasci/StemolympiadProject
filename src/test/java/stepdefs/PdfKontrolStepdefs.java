package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.LocatorsInterface;
import utils.BaseClass;
import utils.Config;
import utils.PdfClass;

import java.util.List;

import static pages.InformationClass.*;

public class PdfKontrolStepdefs extends PdfClass implements LocatorsInterface {


    @Given("pdf kontrol")
    public void pdfKontrol() {
        Config.maximized = true;
        verifyContentInPDf(mathMiniCategoryPdf, mathminiCategory);
        verifyContentInPDf(mathJuniorCategoryPdf, mathjuniorCategory);
        verifyContentInPDf(mathMiddleCategoryPdf, mathmiddleCategory);
        verifyContentInPDf(mathSeniorCategoryPdf, mathseniorCategory);
        verifyContentInPDf(compScienceJuniorCategoryPdf, compScienceJunior);
        verifyContentInPDf(compScienceMiddleategoryPdf, compScienceMiddle);
        verifyContentInPDf(compScienceSeniorCategoryPdf, compScienceSenior);
        verifyContentInPDf(popularScienceMiniGroupsPdf, popularScienceMini);
        verifyContentInPDf(popularScienceJuniorCategoryPdf, popularScienceJunior);
        verifyContentInPDf( popularScienceMiddleCategoryPdf, popularScienceMiddle);
        verifyContentInPDf(popularScienceSeniorCategoryPdf, popularScienceSenior);

driver.close();


    }
}
