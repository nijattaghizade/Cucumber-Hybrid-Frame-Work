package ui_automation.step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui_automation.pages.tabelPage;
import ui_automation.utilities.Driver;

import java.util.List;

public class tableSteps {


    tabelPage tabelPage=new tabelPage();
    @Then("User gets elements from row")
    public void user_gets_elements_from_row() {

        List<WebElement> rows= Driver.getInstance().getDriver().findElements(By.xpath("//*[@id='BooksAuthorsTable']"));
        StringBuilder stringBuilder = new StringBuilder();
       for ( WebElement eachrow: rows){

           stringBuilder.append(eachrow.getText()).append(",");

       }
        String allValuesWithCommas = stringBuilder.toString();
        System.out.println(allValuesWithCommas);

    }
}


