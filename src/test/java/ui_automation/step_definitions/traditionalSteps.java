package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import ui_automation.utilities.Base;
import ui_automation.utilities.Driver;

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

    @Given("User clicks  button")
    public void user_clicks_button() throws FileNotFoundException, InterruptedException {
        String locator=property.getProperty("FirstName");

        Driver.getInstance().getDriver().findElement(By.xpath(locator)).sendKeys("Nico");

    Thread.sleep(1000);

    }


    @Given("User clicks {string}")
    public void user_clicks(String element) throws InterruptedException {


        String locator=property.getProperty(element);

        Driver.getInstance().getDriver().findElement(By.xpath(locator)).sendKeys("Nico");

        Thread.sleep(1000);

    }





//    @Given("User clicks button")
//    public void user_clicks_button(String element) {
//        Driver.getInstance().getDriver().get("https://demo.automationtesting.in/Register.html");
//
//        String locator=Base.property.getProperty(element);
//        System.out.println(locator);
//        //Driver.getInstance().getDriver().findElement(By.xpath(locator)).click();
//
//
//
//    }



}
