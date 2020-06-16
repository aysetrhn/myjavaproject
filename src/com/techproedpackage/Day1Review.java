package com.techproedpackage;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Review {
    //1. Create a class : Day1Review
    //2. ChromeDriver kullanarak, youtube web sayfasina gidin( "https://www.youtube.com/")
        // ve verify if page title is “youtube”, If not, print the correct title.
    //3. Verify if the page URL contains youtube if not, print the right url.
    //4. Then Navigate to https://www.amazon.com/
    //5. Navigate back to youtube
    //6. Refresh the page
    //7. Navigate forward to amazon
    //8. Maximize the window
    //9. Then verify if page title contains “Amazon”, If not, print the correct title.
    //10.Verify if the page URL is https://www.amazon.com/, if not print the correct url
    //11.Quit the browser
    public static void main(String[] args) {
        //create chromedriver
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // youtube web sayfasina git
        driver.get("https://www.youtube.com/");

        //Sayfa basliginin(Title) "youtube" olup olmadigini dogrula(verify)
        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle = "youtube";
        if(actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual Youtube Title: "+actualYoutubeTitle);
        }

        //Sayfa URL'inin "youtube" kelimesini icerip icermedigini dogrula(verify)
        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";
        if(actualYoutubeURL.contains(expectedYoutubeURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual Youtube URL: "+actualYoutubeURL);
        }

        driver.navigate().to("https://www.amazon.com/"); //amazon web sayfasina git
        driver.navigate().back();   //bir onceki web sayfasina(youtube) geri git
        driver.navigate().refresh(); //sayfayi yenile
        driver.navigate().forward(); //bir sonraki sayfaya(amazon) git
        driver.manage().window().maximize(); //sayfayi tam ekran yap

        //sayfa basliginin(title) "Amazon" icerip icermedigini dogrula
        String actualAmazonTitle = driver.getTitle();
        String expectedAmazonTitle = "Amazon";
        if(actualAmazonTitle.contains(expectedAmazonTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON TITLE: "+ actualAmazonTitle);
        }

        //Sayfa URL inin "https://www.amazon.com/" oldugunu dogrula
        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";
        if(actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON URL: "+actualAmazonURL);
        }

        driver.quit();
    }
}
