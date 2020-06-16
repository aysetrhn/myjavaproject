package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {
        //1.Create a new class: VerifyTitleTest (BaşlıkDoğrulamaTesti)
        //2. Navigate to google homepage(ana sayfa) "https://www.google.com/"
        //3. Verify if google title is “Google”
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE: "+actualTitle);
            System.out.println("EXPECTED TITLE: "+expectedTitle);
        }


    }
}
