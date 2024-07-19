package io.day_6;

import io.base.BeforeAndAfter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demoqa extends BeforeAndAfter {

        @Test(priority = 1)
    public void goToWebsite(){
            driver.get("https://demoqa.com/alerts");
            WebElement clickAlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
            clickAlertButton.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        @Test(priority = 2)
    public void goToWebsite2() throws InterruptedException {
            driver.get("https://demoqa.com/alerts");
            WebElement clickAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
            clickAlertButton.click();
            Thread.sleep(6000);
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
        @Test(priority = 3)
    public void goToWebsite3(){
            driver.get("https://demoqa.com/alerts");
            WebElement clickAlertButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
            clickAlertButton.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            WebElement successMessage = driver.findElement(By.xpath("//span[@id='confirmResult']"));
            String actual = successMessage.getText();
            String expected = "You selected Ok";
            Assert.assertTrue(actual.equals(expected));
            clickAlertButton.click();
            driver.switchTo().alert().dismiss();
            actual = successMessage.getText();
            expected = "You selected Cancel";
            Assert.assertTrue(actual.equals(expected));
        }
        @Test(priority = 4)
    public void goToWebsite4(){
            driver.get("https://demoqa.com/alerts");
            WebElement clickAlertButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
            clickAlertButton.click();
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Loop Academy");
            alert.accept();
            WebElement successMessage = driver.findElement(By.xpath("//span[@id='promptResult']"));
            String actual = successMessage.getText();
            String expected = "You entered Loop Academy";
            Assert.assertEquals(actual, expected);


        }
    }

