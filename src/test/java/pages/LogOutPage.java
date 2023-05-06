package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class LogOutPage {
    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="gh-ug")
    public WebElement hoverOverUser;

    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement signOut;

}
