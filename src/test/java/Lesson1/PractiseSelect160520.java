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

import java.util.concurrent.TimeUnit;

public class PractiseSelect160520 {
    public static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();}

        @Test

    public void nextUK(){
           // JavascriptExecutor js = (JavascriptExecutor) driver;
           // js.executeScript("windows.srcollBy(0,500)");
            WebElement mouseHover = driver.findElement(By.xpath("//header//li[4]//a[1]//span[1]"));
            Actions action = new Actions(driver);




        }

}
