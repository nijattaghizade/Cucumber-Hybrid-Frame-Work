package ui_automation.practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui_automation.utilities.ConfigurationReader;
import ui_automation.utilities.Driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class practice {

    public static void main(String[] args) throws IOException, InterruptedException {

       // String drop= ConfigurationReader.getProperty("locators","dropdown");
       // String username = ConfigurationReader.getProperty("ui-config.properties","dropdown");
      //  System.out.println(username);


//        File src=new File("src/test/resources/locators.properties");
//        FileInputStream file=new FileInputStream(src);
//        Properties obj=new Properties();
//        obj.load(file);





        // System.out.println(username);
       // WebElement web=Driver.getInstance().getDriver().findElement(By.xpath(obj.getProperty("dropdown")));
      //  System.out.println(obj.getProperty("dropdown"));


        Driver.getInstance().getDriver().get("https://www.facebook.com/");
        Thread.sleep(5000);


    }




}
