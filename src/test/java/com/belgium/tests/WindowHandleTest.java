package com.belgium.tests;

import com.belgium.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        String anaSayfawinowHanle = driver.getWindowHandle();
        System.out.println("Ana sayfa winow hanle : "+anaSayfawinowHanle);
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        Thread.sleep(5000);
        driver.switchTo().window(anaSayfawinowHanle);

        String ikinciWinowHanle = "";
        Set<String> tumWinowlar = driver.getWindowHandles();

        for (String w:tumWinowlar) {
            if(!w.equals(anaSayfawinowHanle))
                ikinciWinowHanle = w;
            System.out.println(w);
        }
        Thread.sleep(2000);
        driver.switchTo().window(ikinciWinowHanle);
    }



}
