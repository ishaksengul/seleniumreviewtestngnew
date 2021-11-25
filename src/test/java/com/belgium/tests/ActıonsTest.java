package com.belgium.tests;

import com.belgium.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActıonsTest extends TestBase {

    @Test
    public void sagTiklama() {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Actions actions = new Actions(driver);
        WebElement rightClick = driver.findElement(By.xpath("//*[.='right click me']"));
        actions.contextClick(rightClick).perform();
    }

    @Test
    public void ciftTiklama(){
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Actions actions = new Actions(driver);
        WebElement oubleClick = driver.findElement(By.tagName("button"));
        actions.doubleClick(oubleClick).perform();
    }

    @Test
    public void hoverOver(){
        Actions actions = new Actions(driver);
        driver.get("https://amazon.com");
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(accountList).perform();
    }

    @Test
    public void asagiYukariGit() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.get("https://amazon.com");
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Test
    public void keyUpKeyown(){
        Actions actions = new Actions(driver);
        driver.get("https://google.com");
        WebElement element1 = driver.findElement(By.xpath("(//div[@role='none'])[5]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
        WebElement textBox = driver.findElement(By.name("q"));
        actions.moveToElement(textBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("merhaba")
                .keyUp(Keys.SHIFT)
                .sendKeys(" nasilsiniz")
                .perform();
    }
    @Test
    public void ikiTusaTiklama(){
        Actions actions = new Actions(driver);
        driver.get("https://google.com");
        WebElement element1 = driver.findElement(By.xpath("(//div[@role='none'])[5]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element1);
        element1.click();
        WebElement textBox = driver.findElement(By.name("q"));
        actions.keyDown(Keys.ALT).keyDown(Keys.F4).perform();
    }

}
