package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionDemo {
    static WebDriver driver;
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
    public void action() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000);");
        Thread.sleep(2000);

        WebElement mouseHover= driver.findElement(By.id("mousehover"));
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.moveToElement(mouseHover).perform();
        Thread.sleep(3000);

 WebElement subelement = driver.findElement(By.linkText("Top"));
 action.moveToElement(subelement).click().perform();


    }
}
