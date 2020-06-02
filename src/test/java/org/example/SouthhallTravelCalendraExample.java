package org.example;

import org.junit.Before;
import org.junit.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SouthhallTravelCalendraExample {
    public static WebDriver driver;

    @Before
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.southalltravel.co.uk/?gclid=EAIaIQobChMI64bLy9Kf6QIVB7DtCh1CegqLEAAYASAAEgK6iPD_BwE");
        driver.manage().window().maximize();
    }
    @Test
  public void arrivals(){


        WebElement arrivalbox = driver.findElement(By.xpath("//li[4]//input[1]"));
         arrivalbox.click();

      // WebElement MayCalander= driver.findElement(By.id(".ui-state-default"));// needed for multiple method
        //System.out.println(MayCalander.isDisplayed()); // this option is for boleen true or false

        List<WebElement> arrivaltime =driver .findElements(By.cssSelector("ui-state-default"));
         for (WebElement arrivaltimes:arrivaltime){
            System.out.println(arrivaltimes.getAttribute("data-event"));
            // if (arrivaltimes.getAttribute("data-event").contains("19")){
                 //arrivaltimes.click();
            }

         }
    }






