package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import ui_automation.utilities.Base;
import ui_automation.utilities.Driver;
import ui_automation.utilities.WaitHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class traditionalSteps extends Base {


    @Given("User Navigates to given page {string}")
    public void user_Navigates_to_given_page(String page) throws InterruptedException {
        Driver.getInstance().getDriver().get(page);
    }

    @Given("User clicks {string}")
    public void user_clicks(String element) throws InterruptedException {
        String locator=property.getProperty(element);
        Driver.getInstance().getDriver().findElement(By.xpath(locator)).click();
        Thread.sleep(1000);
    }

    @Then("User waits {int} seconds")
    public void userWaits(int time) {
        WaitHelper.wait(time);

    }
}
