package io.day_4;

import io.utill.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://beta.docuport.app/login");
        driver.manage().window().maximize();
        WebElement loginBox = driver.findElement(By.xpath("//label[.='Username or email']//following-sibling::input"));
        loginBox.sendKeys(DocuportConstants.LOGIN + Keys.TAB + DocuportConstants.PASSWORD + Keys.ENTER);
        Thread.sleep(2000);
        WebElement continueButton = driver.findElement(By.xpath("//span[.=' Continue ']"));
        continueButton.click();

        if (driver.getCurrentUrl().equals(DocuportConstants.LOGGED_URL)) {
            System.out.println("User page is open => TEST PASSED");
        } else {
            System.err.println("User page is NOT open => TEST FAILED");
        }

        WebElement batchButton = driver.findElement(By.xpath("//span[.='Batch1 Group2']"));
        batchButton.click();
        Thread.sleep(2000);

        WebElement logOutButton = driver.findElement(By.xpath("//span[.='Log out']"));
        logOutButton.click();
        Thread.sleep(2000);
        if(driver.getCurrentUrl().equals(DocuportConstants.LOGOUT_URL)){
            System.out.println("Successfully log out =>  TEST PASSED");
        }else{
            System.err.println(("User page is open  =>  TEST FAILED"));
        }




    }
}
    /*1. login to docuport application
     2. logout from docuport application
     3. Validate successful login
     4. Validate successful logout

     */