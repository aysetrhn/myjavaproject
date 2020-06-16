package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    //Yeni bir class oluşturun: class name ⇒ BasicNavigations
    //Create main method
    //Chrome driver oluşturun
    //https://www.google.com/ adresinden google ana sayfasını açın.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //1.Navigate to amazon home page  https://www.amazon.com/
        //2. Navigate back to google
        //3. Navigate forward to amazon
        //4. Refresh(yenile) the web page
        //5. Maximize the window
        //6. Close/Quit the browser

        driver.navigate().to("https://amazon.com");
        driver.navigate().back(); //bir onceki sayfaya donulur(google)
        driver.navigate().forward(); //tekrar sonraki sayfaya gidilir.(amazon)
        driver.navigate().refresh(); //sayfayi yeniler(refresh)
        driver.manage().window().maximize(); //sayfayi tam ekran yapar
        driver.quit();

        //navigate().to(); ve get(); metodlari neredeyse ayni islemi yapar.
        //Farklari -->
            //get(); --> url yi acar.sayfanin yuklenmesini bekler. Bir onceki sayfaya donemezsiniz.
            //navigate().to(); --> url yi acar. Sayfanin yuklenmesini beklemez. navigate back ve forward yapabilirsiniz.
    }
}
