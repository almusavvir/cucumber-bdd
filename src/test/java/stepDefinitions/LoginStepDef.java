package stepDefinitions;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import java.time.Duration;

public class LoginStepDef {

    static WebDriver driver;

    @BeforeClass
    public static void Setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void LoginTest() {
        LoginPage lp = new LoginPage(driver);
        lp.setUserName("Admin");
        lp.setPassword("admin123");
        lp.clickLoginButton();
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @AfterClass
    public static void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
