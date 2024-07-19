package io.day_7;

import io.base.BeforeAndAfter;
import io.utill.DocuportUtill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlexDeSouza extends BeforeAndAfter {
    /*
    task2
=============


login as an advisor
go to users
validate that full name for alex.de.souza@gmail.com is Alex De Souza - we did in class
validate that user name for alex.de.souza@gmail.com is alexdesouze
validate that phone number for alex.de.souza@gmail.com is +994512060042
validate that role for alex.de.souza@gmail.com is client
validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */
@Test
    public void web_Tables() throws InterruptedException {
    DocuportUtill.login(driver, "advisor");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement users = driver.findElement(By.xpath("//span[text()='Users']"));
    users.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    String givenEmail = "alex.de.souza@gmail.com";
    String expectedFullName ="Alex De Souza";
    String expectedUserName = "alexdesouze";
    String expectedPhoneNumber = "+994512060042";
    String expectedRole = "client";
    String expectedAdvisor = "Batch1 Group1";
}


}