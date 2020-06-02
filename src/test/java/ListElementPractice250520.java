import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListElementPractice250520 {
    public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.southalltravel.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void Calaendar() throws InterruptedException {
        List<WebElement> dates =driver.findElements(By.cssSelector("ui-state-default"));
        Thread.sleep(5000);
        for (WebElement maydate: dates){
            Thread.sleep(5000);
            System.out.println(maydate.getText());
           // if (maydate.getText().equals("")) {
               // maydate.click();
             //driver.quit();
            }
            


            
        }




            ////if (date.getText().equals("5")) {
               // date.click();

        //driver.quit();
    }
//}
