package io.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String googleUrl = "https://www.google.com/";
        driver.get(googleUrl);
        WebElement gMailButton = driver.findElement(By.className("gb_I"));
        gMailButton.click();
        String expected = "Gmail";

        String actual = driver.getTitle();
        if(actual.equals(expected)){
            System.out.println("Test passed. " + "Actual: " + actual + " Expected: " + expected);
        }else{
            System.err.println("Test failed. " + "Actual: " + actual + " Expected: " + expected);
        }
        driver.navigate().back();
        actual = driver.getTitle();
        expected = "Google";
        if(actual.equals(expected)){
            System.out.println("Test passed. " + "Actual: " + actual + " Expected: " + expected);
        }else{
            System.err.println("Test failed. " + "Actual: " + actual + " Expected: " + expected);
        }
        driver.quit();

    }
}
/*1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google

 */