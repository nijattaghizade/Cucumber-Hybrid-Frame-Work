package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ui_automation.pages.PracticePage;
import ui_automation.utilities.Driver;

public class PracticeSteps {

PracticePage practicePage=new PracticePage();


    @Given("user navigates to download page")
    public void user_navigates_to_download_page() {
        Driver.getInstance().getDriver().get("https://filesamples.com/formats/png");
    }

    @Then("user successfully downloads the file")
    public void user_successfully_downloads_the_file() throws InterruptedException {
        practicePage.downLoad.click();
        Thread.sleep(5000);

    }
}
