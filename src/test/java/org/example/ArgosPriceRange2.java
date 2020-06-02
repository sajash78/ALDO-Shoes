package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArgosPriceRange2 {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

    }

    @Test
    public void pricerange() {

        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("nike");

        WebElement searchbutton = driver.findElement(By.className("_1gqeQ"));
        searchbutton.click();

        List<WebElement> priceranges = driver.findElements(By.cssSelector(".Checkboxstyles__Label-e3lxpy-4.hWEwsp.font-standard"));
        for (WebElement pricerange : priceranges) {
          //  System.out.println(pricerange.getAttribute("value"));

            if (pricerange.getAttribute("value").contains("£10 - £15")) {
                pricerange.click();
            }

        }
    }
}