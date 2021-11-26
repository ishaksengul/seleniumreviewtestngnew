package com.belgium.tests;

import com.belgium.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends TestBase {
    @BeforeMethod
    public void beforeMetho(){
        driver.get("https://cosmocode.io/automation-practice-webtable/");
//        WebElement element1 = driver.findElement(By.id("countries"));
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView();", element1);
    }

    @Test
    public void basliklar(){
        //sayfanin basliklari //thead//th
        List<WebElement> basliklar = driver.findElements(By.xpath("//tbody//tr[1]"));
        for (WebElement w:basliklar) {
            System.out.println(w.getText());
        }

    }

    @Test
    public void tumSatirlar(){
        List<WebElement> satirlar = driver.findElements(By.xpath("//tbody//tr"));
        for (WebElement w:satirlar) {
            System.out.println(w.getText());
        }
    }
    @Test
    public void sutunYazdirma(){
        List<WebElement> sutun5 = driver.findElements(By.xpath("//tbody//tr[5]"));
        for (WebElement w:sutun5) {
            System.out.println(w.getText());
        }
    }
    @Test
    public void hucre(){
        List<WebElement> hucre1 = driver.findElements(By.xpath("//tbody//tr[5]/td[2]"));
        for (WebElement w:hucre1) {
            System.out.println(w.getText());
        }
    }

    @AfterMethod
    public void afterMetho(){
        //driver.quit();
    }


}
