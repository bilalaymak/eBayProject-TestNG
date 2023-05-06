package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class DeleteAccountPage {
    public DeleteAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="gh-ug")
    public WebElement hoverOverUser;

    @FindBy(xpath = "//*[text()='Account settings']")
    public WebElement accountSettings;

    @FindBy(xpath = "//*[text()='Close account']")
    public WebElement closeAccount;

    @FindBy(xpath = "//*[text()='Close account']")
    public WebElement closeAccountButton;



}
