package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Interview1605 {
    public static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.britishairways.com/en-gb/flights-and-holidays/flights");
        driver.manage().window().maximize();
    }

    @Test
    public void britishAirWay() throws InterruptedException {

       // Actions action = new Actions(driver);
        WebElement book = driver.findElement(By.linkText("Book"));
        Actions action = new Actions(driver);

        Thread.sleep(10000);

        action.moveToElement(book).perform();
        Thread.sleep(10000);
        WebElement bookaFlight = driver.findElement(By.linkText("Book a flight"));
        action.moveToElement(bookaFlight).click().perform();
        Thread.sleep(10000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        java.lang.Thread.sleep(3000);

        //Scroll down by 1900 pixel
        js.executeScript( "window.scrollBy(0,800)");

        WebElement dropbox = driver.findElement(By.id("depCountry"));

        Select sel = new Select(dropbox);
        sel.selectByValue("US");








    }
}
