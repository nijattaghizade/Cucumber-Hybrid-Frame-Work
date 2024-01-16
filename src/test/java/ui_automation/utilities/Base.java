package ui_automation.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



    public class Base {
        public static Properties property;

        public Base() {
            try{
                property=new Properties();
                String filePath="src/test/resources/locators.properties";
                File file=new File(filePath);
                FileInputStream fis=new FileInputStream(file);
                property.load(fis);
            }catch(IOException e){
                //System.out.println("api-config.properties file couldn't be read");
                e.printStackTrace();
            }




        }



    }
