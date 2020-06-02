package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShotOfResult {
    static WebDriver driver;
    @Before
    public void setup(){

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void result() throws InterruptedException {
        WebElement loginButton =driver.findElement(By.id("u_0_b"));
        loginButton.click();
        Thread.sleep(3000);// VERY IMPORTANT without it it may take homepage screenshot.
    }
    @Before
    public void teardown() throws IOException {

        TakesScreenshot screenshot= ((TakesScreenshot)driver);
        File soursefile= screenshot.getScreenshotAs(OutputType.FILE);
        File destinationfile= new File("C:\\C:\\Users\\Saj Work\\ScreenShotFile.png");
        FileUtils.copyFile(soursefile,destinationfile); // very important for screenshot


    }



}
