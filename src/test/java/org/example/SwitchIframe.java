package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchIframe {

     public static WebDriver driver;
    @Before
    public void setup(){

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();

    }
    @Test
    public void iFrame() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame(0);
       // driver.switchTo().frame("courses-iframe");
        Thread.sleep(1000);

        WebElement searchCourse = driver.findElement(By.id("search-courses"));
        searchCourse.sendKeys("Java");
       // driver.switchTo().defaultContent();

       // Thread.sleep(4000);

       // WebElement bmwradio = driver.findElement(By.id("bmwradio"));
       // bmwradio.click();
    }

    @Test
    public void iFrame1(){
        driver.switchTo().frame(0);
        WebElement findCousres = driver.findElement(By.id("search-courses"));
        findCousres.sendKeys("saj");
        driver.switchTo().defaultContent();

        WebElement benz = driver.findElement(By.id("benzradio"));
        benz.click();

    }


    }


