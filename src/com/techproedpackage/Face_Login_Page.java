package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Login_Page {
    //1. go to https://www.facebook.com/
    //2. username ve password'un valid(gecerli) olup olmadigini test edin.
    //username="testusername"
    //password="testpassword"
    //Step 1. locate the username box
    //Step 2. locate the password box
    //Step 3. locate the signin button
    //Step 4. click on the sign in button
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

             //cssSelector kullanarak
//        WebElement emailBox = driver.findElement(By.cssSelector("#email"));
//        WebElement passwordBox = driver.findElement(By.cssSelector("#pass"));
//        WebElement loginButton = driver.findElement(By.cssSelector("#u_0_b"));
//
//        emailBox.sendKeys("testusername");
//        passwordBox.sendKeys("testpassword");
//        loginButton.click();

           //xpath kullanarak
//        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
//        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='pass']"));
//        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
//
//        emailBox.sendKeys("testusername");
//        passwordBox.sendKeys("testpassword");
//        loginButton.click();

        //1.Find the webelements of
            //"Sign Up"
            //"Connect with friends and the world around you on Facebook."
        //2.Locate and send text to
            //"First name"=testfirstname
            //"Last name"=testlastname
            //"Mobile number or email"=test@gmail.com
            //"New Password"=testpassword
        WebElement signUp = driver.findElement(By.xpath("//h2[@class='_8est']"));
        System.out.println(signUp.getText());

        WebElement element = driver.findElement(By.xpath("//h2[@class='_8eso _3ma']"));
        System.out.println(element.getText());

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("testfirstname");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("testlastname");
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("test@gmail.com");
        WebElement newPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        newPassword.sendKeys("testpassword");







    }
}
