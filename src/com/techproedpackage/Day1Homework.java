package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Homework {
    //1. Create a new class : Day1Homework
    //2. Using ChromeDriver, Go to facebook and verify if page title is “facebook”,
    //     If not  print the correct title.
    //3. Verify if the page URL contains "facebook",if not print the right url.
    //4. Then Navigate to https://www.walmart.com/
    //5. Verify if the walmart page title contains “Walmart.com”
    //6. Navigate back to facebook
    //7. Refresh the page
    //8. Maximize the window
    //9. Close the browser
    public static void main(String[] args) {
        //create chromedriver
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // facebook web sayfasina git
        driver.get("https://www.facebook.com/");

        String actualFacebookTitle = driver.getTitle();
        String expectedFacebookTitle = "facebook";
        if(actualFacebookTitle.equals(expectedFacebookTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("CORRECT TITLE: "+actualFacebookTitle);
        }

        String actualFacebookURL = driver.getCurrentUrl();
        String expectedFacebookURL = "facebook";
        if(actualFacebookURL.contains(expectedFacebookURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("CORRECT URL:"+actualFacebookURL);
        }

        driver.navigate().to("https://www.walmart.com/");
        String actualWalmartTitle = driver.getTitle();
        String expectedWalmartTitle = "Walmart.com";
        if(actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("CORRECT WALMART TITLE: "+actualWalmartTitle);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();



    }
}
