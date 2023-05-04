package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage {

    @FindBy(id="gh-ug")
    public WebElement hoverOverUser;

    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement signOut;

}
