package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInt {
    public static void main(String[] args) {

//        email textbox,password textbox, and signin button elementlerini locate ediniz..

//        Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        Username :  testtechproed@gmail.com
//        Password : Test1234!
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //locate emailTextBox
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        //locate password text box
        WebElement passwordTextBox =  driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");

        //locate sign in button
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();


    }

}
