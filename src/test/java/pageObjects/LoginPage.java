package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // locators
    By usernameLoc = By.xpath("//input[@placeholder='Username']");
    By passwordLoc = By.xpath("//input[@placeholder='Password']");
    By loginButtonLoc = By.xpath("//button[normalize-space()='Login']");

    // action methods
    public void setUserName(String user) {
        driver.findElement(usernameLoc).sendKeys(user);
    }
    public void setPassword(String password) {
        driver.findElement(passwordLoc).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(loginButtonLoc).click();
    }
}
