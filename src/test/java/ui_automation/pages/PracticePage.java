package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

import java.util.List;

public class PracticePage {

    WebDriver driver;
    public PracticePage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[text()='Download'])[1]")
    public WebElement downloadButton;

    @FindBy (id = "ExpenseDateTime")
    public WebElement expenseDateTime;

    @FindBy (xpath = "//div[@id='ExpenseDateTime_root']//button[@class='picker__button--today']")
    public WebElement todayDate;

    @FindBy (id = "Amount")
    public WebElement amount;

    @FindBy (id = "name")
    public WebElement name;

    @FindBy (id = "BusinessPurpose")
    public WebElement businessPurpose;

    @FindBy (id = "Company")
    public WebElement company;

    @FindBy (id = "ProjectName")
    public WebElement projectName;

    @FindBy (xpath = "//*[@class='nav navbar-nav navbar-menu-item']/li")
    public List<WebElement> mainMenu;

    @FindBy (xpath = "(//*[contains(@class,'add-expense-button')])[2]")
    public WebElement addExpanseBtn;

    @FindBy (name = "usernameOrEmailAddress")
    public WebElement userName;

    @FindBy (name = "Password")
    public WebElement password;

    @FindBy (id = "LoginButton")
    public WebElement loginButton;

    @FindBy (css = ".save-button")
    public WebElement expenseSaveBtn;

    @FindBy (xpath = "(//a[@class='btn btn-primary pull-right'])[1]")
    public  WebElement downLoad;

}
