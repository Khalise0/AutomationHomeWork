package io.day_7;

import io.base.BeforeAndAfter;
import io.utill.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class nestedIFraims extends BeforeAndAfter {

    @Test public void middle(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html"); // go to webpage
        //driver.navigate().to("https://loopcamp.vercel.app/nested-frames.html");


        driver.switchTo().frame("frame-top"); // switch on top iframe by using name
        driver.switchTo().frame("frame-middle");//switch on the middle iframe by name

        WebElement middleIframe = driver.findElement(By.xpath("//div[text()='MIDDLE']"));
        // looking for element by xpath

        String actual = middleIframe.getText(); // declaring and taking

        Assert.assertEquals(actual.trim(),"MIDDLE");
    }
    @Test public void right(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");

        WebElement rightIframe = driver.findElement(By.xpath("//*[contains(text(),'RIGHT')]"));

        String actual = rightIframe.getText();

        Assert.assertEquals(actual.trim(),"RIGHT");
    }

    @Test public void bottom(){
        driver.navigate().to("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-bottom");

        WebElement bottomIframe = driver.findElement(By.xpath("//*[contains(text(),'BOTTOM')]"));
        Assert.assertTrue(bottomIframe.getText().equals("BOTTOM"));
    }


}
/*
go to https://loopcamp.vercel.app/nested-frames.html
validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"

 */
