package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "(//a[text() ='Sign in'])[1]")
    public WebElement signInButton;

    @FindBy(id = "userid")
    public WebElement emailUserNameBox;

    @FindBy(id = "signin-continue-btn")
    public WebElement continueButton;

    @FindBy(id = "signin-error-msg")
    public WebElement errorMessage;

    @FindBy(id = "pass")
    public WebElement passwordsBox;

    @FindBy(id = "sgnBt")
    public WebElement loginButton;

}
