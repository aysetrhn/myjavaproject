package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioButton {
    //Create a class : CheckBox_RadioButton
    //Create main method and complete the following task.
    //Go to https://the-internet.herokuapp.com/checkboxes
    //Locate the elements of checkboxes
    //Then click on checkbox1 if box is not selected
    //Then click on checkbox2 if box is not selected
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if(!checkBox1.isSelected()){  //TRUE
            checkBox1.click();
        }else {
            System.out.println("CHECKBOX 1 DAHA ONCEDEN CHECK YAPILMIS");
        }

        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if(!checkBox2.isSelected()){  //FALSE
            checkBox2.click();
        }else {
            System.out.println("CHECKBOX 2 DAHA ONCEDEN CHECK YAPILMIS");
        }

    }

}
