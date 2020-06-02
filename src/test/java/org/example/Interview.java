package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Interview {

    public static WebDriver driver;
        @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.iceland.co.uk/");
        driver.manage().window().maximize();

        }

        @Test
     public void ICE(){
            WebElement search= driver.findElement(By.id("header-search"));
            search.sendKeys("crisps");

            WebElement searchbox =driver.findElement(By.xpath("//form[@name='simpleSearch']//div//div//button//*[local-name()='svg']"));
            searchbox.click();

            WebElement range =driver.findElement(By.id("-0000000001"));
            range.click();



        }

}
