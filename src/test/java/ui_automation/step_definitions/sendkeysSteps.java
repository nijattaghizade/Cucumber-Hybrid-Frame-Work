package ui_automation.step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import ui_automation.pages.AutomationPage;

public class sendkeysSteps {

    AutomationPage automationPage=new AutomationPage();

    @Then("User click first name")
    public void user_click_first_name() throws InterruptedException {
        automationPage.firstName.sendKeys("Nico", Keys.TAB);
        Thread.sleep(10000);

    }

    @Then("User sends first name to first name field")
    public void user_sends_first_name_to_first_name_field() {
        automationPage.lastName.sendKeys("Taghi");

    }
}
