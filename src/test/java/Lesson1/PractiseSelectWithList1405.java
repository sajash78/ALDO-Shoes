package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PractiseSelectWithList1405 {
    public static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.southalltravel.co.uk/");
        driver.manage().window().maximize();

    }
    @Test
    public void select(){
        WebElement departFrom = driver.findElement(By.id("DestinationFrom1"));
        departFrom.sendKeys("LHR");
        WebElement dept = driver.findElement(By.id("deptdt"));
        dept.click();
        //WebElement mayCalandar = driver.findElement(By.cssSelector(".ui-state-default"));
       // mayCalandar.click();
        //List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
        //for (date:dates)){
            //System.out.println(dates.contains("data-handler"));
        }

        }



