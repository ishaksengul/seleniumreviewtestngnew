package com.belgium.tests;

import com.belgium.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloaUploadTest extends TestBase {

    @Test
    public void isThereFile(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        boolean varMi = Files.exists(Paths.get("C:\\Users\\HP-g3\\IdeaProjects\\seleniumreviewtestng\\pom.xml"));
        Assert.assertTrue(varMi);

    }
    @Test
    public void fileUploa(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploaButton = driver.findElement(By.id("file-upload"));
        uploaButton.sendKeys("C:\\Users\\HP-g3\\Documents\\selenium dependencies\\libraries\\NOTICE");
        WebElement button = driver.findElement(By.id("file-submit"));
        button.click();
    }

    @Test
    public void inirme() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement foto = driver.findElement(By.linkText("test-file-1.png"));
        foto.click();
        Thread.sleep(2000);
        boolean varMi = Files.exists(Paths.get("C:\\Users\\HP-g3\\Downloads\\test-file-1.png"));
        Assert.assertTrue(varMi);
    }

}
