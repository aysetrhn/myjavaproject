package com.techproedpackage;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntro {
    //Bir class oluşturun: LocatorsIntro
    //Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //Kullanıcı http://a.testaddressbook.com/sign_in  adresine gittiğinde
    //email textbox,password textbox, and signin button elementlerini locate ediniz..
    //Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    //Username :  testtechproed@gmail.com
    //Password : Test1234!
    //Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    //“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    //Sayfadaki toplam link sayısını bulun.
    //Sayfadan çıkış (Sign Out)  yapın.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //email textbox,password textbox, and signin button elementlerini locate ediniz.
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signinButton = driver.findElement(By.name("commit"));

        //Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signinButton.click();
        driver.manage().window().maximize();

        //Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement userID = driver.findElement(By.className("navbar-text"));
        System.out.println("USER ID WEBELEMENT : "+userID);

        String actualUserID = userID.getText();  //getText(); methodu elementin visible textini verir. String return eder.
        System.out.println("USER ID TEXT : "+actualUserID);

        String expectedUserID = "testtechproed@gmail.com";
        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL ID : "+actualUserID);
            System.out.println("EXPECTED ID : "+expectedUserID);
        }

        //“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //By.linkText(); sadece linkler icin calisir.
        WebElement addressLink = driver.findElement(By.linkText("Addresses"));
        String actualAddressLink = addressLink.getText();
        String expextedAddressLink = "Addresses";
        if(actualAddressLink.equals(expextedAddressLink)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ADDRESS LINK TEXT : "+actualAddressLink);
            System.out.println("EXPECTED ADDRESS LINK TEXT: "+expextedAddressLink);
        }

        WebElement signoutLink = driver.findElement(By.linkText("Sign out"));
        String actualSignoutLink = signoutLink.getText();
        String expectedSignoutLink = "Sign Out";
        if(actualSignoutLink.equals(expectedSignoutLink)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL SIGN OUT LINK TEXT : "+actualSignoutLink);
            System.out.println("EXPECTED SIGN OUT LINK TEXT : "+expectedSignoutLink);
        }

        //Sayfadaki toplam link sayisini bulmak
        //findElement(); sadece tek bir element return eder. returns a string
        //findElements(); birden fazla element return eder.--> returns WebElements List --> List<WebElement>
        List<WebElement> listOfWebElement = driver.findElements(By.tagName("a"));
         System.out.println("Sayfada  "+listOfWebElement.size()+" tane link vardir.");
        //Linkleri tek tek yazdiralim
        //3 tane element var.1. elementin indexi get(0) olarak alinir.
        System.out.println("1.webelement => "+ listOfWebElement.get(0));  //return webelement
        //1.elementin yazdirilmasi  --> 1. elementin indexi 0
        System.out.println("1.link text => "+listOfWebElement.get(0).getText());
        //2.elementin yazdirilmasi  --> 2. elementin indexi 1
        System.out.println("2.link text => "+listOfWebElement.get(1).getText());
        //3.elementin yazdirilmasi  --> 3. elementin indexi 2
        System.out.println("3.link text => "+listOfWebElement.get(2).getText());

        //for each loop kullanarak tum elementlerin yazdirabiliriz.
        for (WebElement element :listOfWebElement) {
            System.out.println(element.getText());

        }

        //By.partialLinkText();

        WebElement addressPartialLink = driver.findElement(By.partialLinkText("Address"));
        String actualAddressPartialLink = addressPartialLink.getText();
        System.out.println("Address by partial link text : "+actualAddressPartialLink);

        WebElement signoutPartialLink = driver.findElement(By.partialLinkText("Sign out"));
        String actualSignoutPartialLink = signoutLink.getText();
        System.out.println("Sign Out by partial link text : "+actualSignoutPartialLink);

    }




}
