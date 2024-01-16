package ui_automation.step_definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui_automation.pages.AmazonPage;
import ui_automation.utilities.BrowserHelper;
import ui_automation.utilities.Driver;
import ui_automation.utilities.Helper;

import java.util.TreeMap;

public class amazonSteps {
      AmazonPage page=new AmazonPage();
    Helper help=new Helper();


    @When("User Opens https:\\/\\/www.amazon.in\\/ web page")
    public void user_Opens_https_www_amazon_in_web_page() {

        Driver.getInstance().getDriver().get("https://www.amazon.in/");

    }

    @Then("User Clicks on the hamburger menu in the top left corner")
    public void user_Clicks_on_the_hamburger_menu_in_the_top_left_corner() throws InterruptedException {
      //  AmazonPage page=new AmazonPage();
        page.hamburger.click();
        Thread.sleep(8000);


    }

    @Then("User Scrolls down and then Clicks on the TV, Appliances and Electronics link under Shop by Department section.")
    public void user_Scrolls_down_and_then_Clicks_on_the_TV_Appliances_and_Electronics_link_under_Shop_by_Department_section() throws InterruptedException {
       // AmazonPage page =new AmazonPage();
        page.Tv.click();
        Thread.sleep(8000);

    }

    @Then("Then click on Televisions under Tv, Audio & Cameras sub section.")
    public void then_click_on_Televisions_under_Tv_Audio_Cameras_sub_section() throws InterruptedException {

       // AmazonPage page=new AmazonPage();
        page.Television.click();
        Thread.sleep(9000);

    }

    @Then("Scroll down and filter the results by Brand ‘Samsung’.")
    public void scroll_down_and_filter_the_results_by_Brand_Samsung() throws InterruptedException {
    // Helper help=new Helper();
  //   AmazonPage page=new AmazonPage();
     help.scrollIntoView(page.Samsung);

     Thread.sleep(8000);
     page.Samsung.click();
     Thread.sleep(8000);

    }

    @Then("Sort the Samsung results with price High to Low.")
    public void sort_the_Samsung_results_with_price_High_to_Low() throws InterruptedException {
        //AmazonPage page=new AmazonPage();
        page.sort.click();
        Thread.sleep(8000);
        page.HightoLow.click();
        Thread.sleep(8000);


    }

    @Then("Click on the second highest priced item \\(whatever that maybe at the time of automating).")
    public void click_on_the_second_highest_priced_item_whatever_that_maybe_at_the_time_of_automating() throws InterruptedException {
    // AmazonPage page=new AmazonPage();
     page.secondTv.click();
     Thread.sleep(8000);

    }

    @Then("Switch the Window")
    public void switch_the_Window() throws InterruptedException {
      String mainGUID=Driver.getInstance().getDriver().getWindowHandle();

      for (String windHandle: Driver.getInstance().getDriver().getWindowHandles()){
          Driver.getInstance().getDriver().switchTo().window(windHandle);
      }
        Thread.sleep(8000);


    }

    @Then("Assert that “About this item” section is present and log this section text to console\\/report.")
    public void assert_that_About_this_item_section_is_present_and_log_this_section_text_to_console_report() throws InterruptedException {
       // Helper help=new Helper();
      //  AmazonPage page=new AmazonPage();
        help.scrollIntoView(page.AboutItem);

        Thread.sleep(8000);

        System.out.println(  page.AboutItem.isDisplayed());
        String expected="About this ite";
        String actual=page.AboutItem.getText();
        System.out.println(actual);



        Assert.assertEquals(expected,actual);



        Thread.sleep(5000);


    }



}
