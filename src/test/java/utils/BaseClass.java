package utils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.awt.Robot;

public class BaseClass {

    protected WebDriver driver;
    private WebDriverWait wait;
    Robot robot;
    private void setUpDriver() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);

        if (Config.maximized) {
            driver.manage().window().maximize();
        }


    }

    public void open(String url) {
        setUpDriver();
        driver.get(url);
    }

    /**
     * @param locator
     * @param text
     */
    public void sendKeysTo(By locator, String text) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void clickTo(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void clickTo(WebElement element) {

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void waitForVisibilityOf(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * @param locator
     * @return
     */
    public List<WebElement> getListOf(By locator) {
        return driver.findElements(locator);
    }

    public int getRandom(int min, int max) {

        return min + new Random().nextInt(max - min);
    }

    public void select(By locator, String selectByText) {
        Select objSelect = new Select(driver.findElement(locator));
        objSelect.selectByValue(selectByText);
    }

    public void scroolTo(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();


    }

    public void scroolTo(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

    }


    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void switcToWindow() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public void verifyElementContainsText(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(driver.findElement(locator).getText());
        Assert.assertTrue(driver.findElement(locator).getText().toLowerCase().contains(text.toLowerCase()));
    }


    public void verifyLinks(By locator) {

        List<WebElement> links = driver.findElements(locator);

        System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            verifyLink(url);
        }


    }

    public void verifyLink(String urlLink) {

        try {
            URL link = new URL(urlLink);
            HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
            httpConn.setConnectTimeout(2000);
            httpConn.connect();
            System.out.println(httpConn.getResponseCode() + " - " + urlLink + " - " + httpConn.getResponseMessage());
        } catch (Exception e) {
            System.out.println(urlLink + " - " + e.getMessage());
        }
    }

    public void brokenImages(By locator) {
        List<WebElement> imageList = driver.findElements(locator);
        System.out.println("The page under test has " + imageList.size() + " images");

        Integer iBrokenImageCount = 0;
        for (WebElement img : imageList) {
            if (img != null) {
                HttpClient client = HttpClientBuilder.create().build();
                HttpGet request = new HttpGet(img.getAttribute("src"));
                HttpResponse response = null;
                try {
                    response = client.execute(request);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                /* For valid images, the HttpStatus will be 200 */
                if (response.getStatusLine().getStatusCode() != 200) {
                    System.out.println(img.getAttribute("outerHTML") + " is broken.");
                    iBrokenImageCount++;
                }
            }
        }

    }

    /*  public void clearWithRobotClass(int a) throws AWTException {

          for (int i = 0; i < (a); i++) {

              Robot robot = new Robot();
              robot.keyPress(KeyEvent.VK_BACK_SPACE);
              robot.keyRelease(KeyEvent.VK_BACK_SPACE);

          }


      }
  */
    public void clearWithRobotClassSendKeys(By locator, int a, String text) throws AWTException {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

        for (int i = 0; i < (a); i++) {

   robot = new Robot();

            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);

        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public void robotClass()  {


        for (int i = 0; i < (9); i++) {

        robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }

            robot.keyPress(KeyEvent.ALT_DOWN_MASK);
            robot.keyRelease(KeyEvent.ALT_DOWN_MASK);

        }


    }




}





