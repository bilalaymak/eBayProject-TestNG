package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage {

    @FindBy(id="gh-ug")
    public WebElement hoverOverUser;

    @FindBy(xpath = "//*[text()='Account settings']")
    public WebElement accountSettings;

    @FindBy(xpath = "//*[text()='Close account']")
    public WebElement closeAccount;

    @FindBy(xpath = "//*[text()='Close account']")
    public WebElement closeAccountButton;



}
