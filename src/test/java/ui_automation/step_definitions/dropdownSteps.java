package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui_automation.pages.DropdownPage;
import ui_automation.utilities.ConfigurationReader;
import ui_automation.utilities.Driver;
import ui_automation.utilities.SelectHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class dropdownSteps {

    DropdownPage dropdownPage=new DropdownPage();
    SelectHelper selectHelper=new SelectHelper();
    String locater;

    @Given("User Navigates to {string}")
    public void user_Navigates_to(String string) {

        Driver.getInstance().getDriver().get("https://the-internet.herokuapp.com/");

    }

    @Then("User clicks dropdown from available examples")
    public void user_clicks_dropdown_from_available_examples() throws IOException {
        File src=new File("src/test/resources/ui-config.properties");
        FileInputStream objfile=new FileInputStream(src);
        Properties obj=new Properties();
        obj.load(objfile);




        String username = ConfigurationReader.getProperty("ui-config.properties","dropdown");
       // System.out.println(username);
        WebElement web=Driver.getInstance().getDriver().findElement(By.xpath(obj.getProperty("dropdown")));
        web.click();
      //  dropdownPage.dropwdown.click();



    }

    @Then("User selects rondom dropdown from Dropdown List")
    public void user_selects_rondom_dropdown_from_Dropdown_List() throws InterruptedException {
    //selectHelper.SelectUsingIndex(By.id("dropdown"),2);

    selectHelper.SelectUsingIndexx(dropdownPage.dropdownSelect, 2);

    Thread.sleep(10000);

    }
}
