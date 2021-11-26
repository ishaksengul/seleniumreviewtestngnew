package com.belgium.tests;

import com.belgium.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitTest extends TestBase {

    @Test
    public void implicitlyWait(){
        driver.get("https://google.com");
        WebElement element1 = driver.findElement(By.xpath("(//div[@role='none'])[5]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.click();
    }

    @Test
    public void explicitWait(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
    }

}
