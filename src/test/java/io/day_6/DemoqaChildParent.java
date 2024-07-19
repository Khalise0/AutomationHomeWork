package io.day_6;

import io.base.BeforeAndAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoqaChildParent extends BeforeAndAfter {
    /*go to https://demoqa.com/nestedframes
Validate "Child Iframe" text
Validate "Parent Iframe" text
Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame."
     */
@Test
    public void ParentTest(){
    driver.get("https://demoqa.com/nestedframes");
    driver.switchTo().frame("frame1");
    WebElement parentIFrame = driver.findElement(By.xpath("//body[text()='Parent frame']"));
    Assert.assertEquals(parentIFrame.getText(),"Parent frame");

    WebElement childIframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
    driver.switchTo().frame(childIframe);

    WebElement childFrame = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
    String actual = childFrame.getText();
    String expected = "Child Iframe";
    Assert.assertTrue(actual.equals(expected));


    }
}

