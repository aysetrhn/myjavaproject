package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators_xpath {
    //Create a class : Locators_xpath
    //Create main method and complete the following task.
        //When user goes to +
        //Locate the elements of email textbox,password textbox, and signin button
        //Enter below username and password then click sign in button
        //Username :  testtechproed@gmail.com
        //Password : Test1234!
        //Then verify that the expected user id  testtechproed@gmail.com
        //Verify the Addresses and Sign Out  texts are displayed
        //Find the number of total link on the page
        //Sign out from the page
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //Locate the elements of email textbox,password textbox, and signin button
        //absolute path kullanarak emailBox i locate ediyoruz.
        WebElement emailBox = driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailBox.sendKeys("testtechproed@gmail.com");

        //relative path kullanarak passwordBox'i locate ediyoruz
        WebElement passwordBox = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        passwordBox.sendKeys("Test1234!");

        //locate sign in button
        WebElement signinButton = driver.findElement(By.xpath("//input[@type='submit']"));
        signinButton.click();

        driver.manage().window().maximize();

        //locate id
        WebElement id = driver.findElement(By.xpath("//span[@class='navbar-text']"));
        System.out.println("ID: "+id.getText());
        // verify  expected user id  testtechproed@gmail.com
        String actualUserID = id.getText();
        String expectedUserID = "testtechproed@gmail.com";
        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL ID : "+actualUserID);
            System.out.println("EXPECTED ID : "+expectedUserID);
        }

        //Verify the Addresses and Sign Out  texts are displayed
                                                            //tagname[.='text name']
        WebElement addressesLink = driver.findElement(By.xpath("//a[.='Addresses']"));
        System.out.println("Addresses link text : "+addressesLink.getText());
                                                            //tagname[.='text name']
        WebElement signOutLink = driver.findElement(By.xpath("//a[.='Sign out']"));
        System.out.println("Sign Out Link Text : "+signOutLink.getText());

        //Find the number of total link on the page
        List<WebElement> listOfLinkElement = driver.findElements(By.tagName("a"));
        System.out.println("SAYFADAKI TOTAL LINK SAYISI = "+listOfLinkElement.size());

        //sign out from the page
        signOutLink.click();


    }
}
