package io.utill;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.LinkOption;
import java.time.Duration;

public class DocuportUtill {
    public static void login(WebDriver driver, String role) throws InterruptedException{
        driver.get("https://beta.docuport.app/");
        WebElement username = driver.findElement(By.xpath("//*[@id='input-14']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement login = driver.findElement(By.xpath("//span[text()=' Log in ']"));
        switch(role.toLowerCase()){
            case"client":
                username.sendKeys(DocuportConstants.USERNAME_CLIENT);
                password.sendKeys(DocuportConstants.PASSWORD);
                login.click();
                break;
            case"supervisor":
                username.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
                password.sendKeys(DocuportConstants.PASSWORD);
                login.click();
                break;
            case"advisor":
                username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
                password.sendKeys(DocuportConstants.PASSWORD);
                login.click();
                break;
            case "employee":
                username.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
                password.sendKeys(DocuportConstants.PASSWORD);
                login.click();
                break;
            default: throw new InterruptedException("There is no such role " + role);
        }

    }

}
