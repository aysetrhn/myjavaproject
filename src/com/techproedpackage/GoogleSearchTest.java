package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    //1. Bir class oluşturun: : GoogleSearchTest
    //2. Main method oluşturun ve aşağıdaki görevi  tamamlayın.
        //a. When user goes to https://www.google.com/
        //b. Search for “porcelain teapot”
        //c. And print how many related results displayed on Google
        //d. And click on Shopping
        //e. Then click on the first result
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("porcelain teapot");
        googleSearchBox.submit();

        WebElement searchResults = driver.findElement(By.id("result-stats"));
        System.out.println(searchResults.getText());

        driver.findElement(By.linkText("Αγορές")).click();
       // driver.findElement(By.xpath("//img[@class='TL92Hc']")).click();


    }
}
