package ui_automation.pages;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class AmazonPage {
    static final Logger log = LogManager.getLogger(MBExpensePage.class);
    WebDriver driver;

    public AmazonPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-hamburger-menu")
    public WebElement hamburger;

    @FindBy(xpath = "//*[text()='TV, Appliances, Electronics']")
    public WebElement Tv;

    @FindBy(xpath = "//*[text()='Televisions']")
    public WebElement Television;


    @FindBy (xpath = "//span[text()='Samsung']")
    public WebElement Samsung;

    @FindBy(xpath = "//span[text()='Featured']")
    public WebElement sort;


    @FindBy(xpath = "//a[text()='Price: High to Low']")
    public WebElement HightoLow;


    @FindBy(xpath = "//*[contains(text(),'QA85QN900AKXXL')]")
    public WebElement secondTv;

    @FindBy(xpath = "//*[text()=' About this item ']")
    public WebElement AboutItem;

}