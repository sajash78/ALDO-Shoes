package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KetanPractis {
    public static WebDriver driver;

    @Before
    public void setip(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.tesco.com/");
        driver.manage().window().maximize();
    }//end of set up method

    @Test
    public void Ketan(){
        WebElement signinbutton= driver.findElement(By.xpath("//div[@class='component-tree ui-components-library']//li[1]//div[1]//a[1]"));
        signinbutton.click();

        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("saj");

         WebElement password = driver.findElement(By.id("password"));
         password.sendKeys("1234");



    }// end of test





}// end of class
