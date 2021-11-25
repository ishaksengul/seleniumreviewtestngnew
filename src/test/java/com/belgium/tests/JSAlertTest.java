package com.belgium.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JSAlertTest {

    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement sonAlert = driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
        sonAlert.click();
        String mesaj = driver.switchTo().alert().getText();
        System.out.println(mesaj);
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Ishak est la");
        driver.switchTo().alert().dismiss();
       // driver.switchTo().alert().accept();



    }


}
