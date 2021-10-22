package pages;

import org.openqa.selenium.By;

public class LocatorsClass {
    // Login page locators
    public static final String url = "https://www.saucedemo.com/";
    public static final By usernameTextBox = By.cssSelector("input#user-name");
    public static final String username = "standard_user";
    public static final By passwordTextBox = By.cssSelector("input#password");
    public static final String password = "secret_sauce";
    public static final By loginButton = By.cssSelector("input#login-button");

    // main menu locators
    public static final By toggleMenuButton = By.cssSelector("button#react-burger-menu-btn");
    public static final By menuFrame = By.cssSelector("nav.bm-item-list");
    public static final By menuItems = By.cssSelector("nav.bm-item-list a");
}
