package io.day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tasc2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String etsyUrl = "https://www.etsy.com";
        driver.get(etsyUrl);
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);
        String actual = driver.getTitle();
        String expected = "Wooden spoon | Etsy";
        if(actual.equals(expected)){
            System.out.println("Test passed.");
        }else{
            System.err.println("Test failed.");
        }
        driver.quit();
    }
}
/*1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”

 */