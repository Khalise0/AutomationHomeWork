package io.day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    /*1. go to https://loopcamp.vercel.app/forgot-password.html
2. locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
3. use css
4. verify those elements are displayed
     */
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://loopcamp.vercel.app/forgot-password.html");
        driver.manage().window().maximize();

        WebElement searchForgotPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));
        conclusion(searchForgotPassword, "Forgot Password");

        WebElement searchEmail = driver.findElement(By.cssSelector("label[for='email']"));
        conclusion(searchEmail,"E-mail");

        WebElement emailInput = driver.findElement(By.cssSelector("input[name='email']"));
        conclusion(emailInput,"E-mail input");

        WebElement searchRetrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        conclusion(searchRetrievePassword,"Retrieve Password");

        WebElement searchPoweredByLoopcamp = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        conclusion(searchPoweredByLoopcamp,"Powered By Loopcamp");
        driver.quit();
    }

    public static void conclusion (WebElement element, String name){
        if(element.isDisplayed()){
            System.out.println("\"" + name + "\"" + " IS DISPLAYED => Test passed.");
        }else{
            System.err.println("\"" + name + "\"" + " IS NOT DISPLAYED => Test failed.");
        }
    }
}
