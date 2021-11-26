package com.belgium.SmokeTests;

import com.belgium.pages.FHCTripCreatePage;
import com.belgium.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelYokBize extends TestBase {

    @BeforeMethod
    public void beforeMetho(){
        driver.get("https://amazon.com");
//        WebElement element1 = driver.findElement(By.id("countries"));
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView();", element1);
    }

    @Test
    public void test(){
        FHCTripCreatePage createPage = new FHCTripCreatePage(driver);

        Select select = new Select(createPage.icerikliMenu);
        //createPage.icerikliMenu.sendKeys("Electronics");
        select.selectByVisibleText("Electronics");
        createPage.searchBox.sendKeys("Galaxy Watch 3"+ Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")));
        Assert.assertTrue(message.isDisplayed());

    }
}
