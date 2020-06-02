package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SouthhallTravelnew {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.southalltravel.co.uk/?gclid=EAIaIQobChMI64bLy9Kf6QIVB7DtCh1CegqLEAAYASAAEgK6iPD_BwE");
        driver.manage().window().maximize();

    }

    @Test
    public void Travel() throws InterruptedException {


        WebElement arrivalbox = driver.findElement(By.xpath("//li[4]//input[1]"));
        arrivalbox.click();

       // WebElement maycalendermonth =driver.findElement(By.xpath("//tr[1]//td[5]"));
       // System.out.println(maycalendermonth.isDisplayed()); // needed for multiple months method boolen true or false.

        List<WebElement>alldates= driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement alldate:alldates){
            System.out.println(alldate.getText());

             if (alldate.getText().contains("25")){
                 alldate.click();
                 break;
                }
            }
        }
        @After
    public void tierdown(){
        driver.quit();
        }
}
