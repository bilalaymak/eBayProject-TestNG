package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import util.ConfigReader;
import util.Driver;

public class LoginTest {
    LoginPage loginPage;

    @Test
    public void testLogin() {
        Driver.getDriver().get(ConfigReader.getProperty("eBayUrl"));

        loginPage = new LoginPage();
        loginPage.signInButton.click();

        loginPage.emailUserNameBox.sendKeys(ConfigReader.getProperty("validEmail"));
        loginPage.continueButton.click();

        loginPage.passwordsBox.sendKeys(ConfigReader.getProperty("validPassword"));
        loginPage.loginButton.click();






    }
}
