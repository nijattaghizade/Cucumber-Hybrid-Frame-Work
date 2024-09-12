package ui_automation.step_definitions;

import io.cucumber.java.en.Then;
import ui_automation.pages.DropdownPage;

import java.sql.SQLOutput;

public class dropdown {
    DropdownPage dropdown= new DropdownPage();

    @Then("Locate the dropdown “Year”")
    public void locate_the_dropdown_Year() {

     String year=dropdown.year.getText();
        //System.out.println(year);

    }

    @Then("Print all options for “Year”dropdown on your console")
    public void print_all_options_for_Year_dropdown_on_your_console() {
        String year=dropdown.year.getText();
        System.out.println(year);
    }

    @Then("Select your {int} from “Year” dropdown")
    public void select_your_from_Year_dropdown(Integer int1) {

    }


}
