package io.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAndAfter {

    public WebDriver driver;  // WebDriver outside Before Method because i want to access from every class
    @BeforeMethod
    public void setUpDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

   /* @AfterMethod
    public void closeDriver(){
        driver.close();
    }

    */

}
