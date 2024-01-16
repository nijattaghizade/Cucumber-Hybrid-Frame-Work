package ui_automation.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class DropdownPage {


    static final Logger log = LogManager.getLogger(DropdownPage.class);
    WebDriver driver;

    public DropdownPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);


    }
    @FindBy (xpath = "//*[text()='Dropdown']")
   public WebElement dropwdown;

    @FindBy(id = "dropdown")
    public WebElement dropdownSelect;

}
