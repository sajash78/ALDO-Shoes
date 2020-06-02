package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class NextAction1505 {
    public static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
    }

    @Test
    public void mouseHover(){
        WebElement mousehover = driver.findElement(By.xpath("//body/header/div/nav/div/ul/li[4]/a[1]"));
                Actions action = new Actions(driver);
        action.moveToElement(mousehover).perform();


    }
}
