package ui_automation.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class AutomationPage {

    static final Logger log = LogManager.getLogger(AutomationPage.class);
    WebDriver driver;

    public AutomationPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@placeholder='Last Name']")
    public WebElement lastName;

}
