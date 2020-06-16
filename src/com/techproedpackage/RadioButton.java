package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    //Create a class : CheckBox_RadioButton
    //Create main method and complete the following task.
    //Go to https://www.facebook.com/
    //Locate the elements of radio buttons
    //Then click on the radio buttons if they are not selected

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement radioButtonGender = driver.findElement(By.id("u_0_6"));
        if(!radioButtonGender.isSelected()){
            radioButtonGender.click();
        }else{
            System.out.println("gender zaten secilmis");
        }


        //butun radio buttonlarini locate edin
        //Radio buttonlarindan yalnizca birisi secilebilir
//        WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//        female.click();
//        WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//        WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));

    }
}
