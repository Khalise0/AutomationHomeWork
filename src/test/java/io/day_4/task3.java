package io.day_4;

import io.utill.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {
    /*
1. navigate to docuport application
2. validate placeholders for user name and password
3. without sending username and password click login button
4. validate username and password error messages
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get(DocuportConstants.LOGOUT_URL);
        driver.manage().window().maximize();
        WebElement userNamePlaceholder = driver.findElement(By.xpath(""));
    }
}
