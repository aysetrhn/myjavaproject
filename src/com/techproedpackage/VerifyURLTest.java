package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.DoubleToIntFunction;
import java.util.stream.Stream;

public class VerifyURLTest {
    //1. Create a class: VerifyURLTest
    //2. Navigate to google homepage
    //3. Verify if google homepage url is “www.google.com”
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";

        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL URL: "+actualURL);
            System.out.println("EXPECTED URL: "+expectedURL);
        }
    }
}
