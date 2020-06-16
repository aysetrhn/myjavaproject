package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
       //create chrome driver
        WebDriver driver = new ChromeDriver();
        //herhangi bir web sitesine gitmek icin get(); metodunu kullaniyoruz.
        driver.get("https://www.amazon.com");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // Webdriver'i kapatmak icin close() veya quit() methodlarini kullanabiliriz
             //close() ve quit() methotlarinin farki nedir?
             //close() --> sadece mevcut sayfayi kapatir. quit() --> butun sayfalari kapatir
        driver.quit();
    }
}
