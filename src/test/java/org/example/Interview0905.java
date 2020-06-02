package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Interview0905 {
    public static WebDriver driver;

    @Before

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

    }

    @Test
    public void argos() throws InterruptedException {
        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("nike");
        Thread.sleep(4000);
        WebElement searchbutton = driver.findElement(By.className("_2mKaC"));
        searchbutton.click();
        Thread.sleep(6000);

        WebElement relenvencedrop = driver.findElement(By.id("sort-select"));
        relenvencedrop.click();

        Select sel = new Select(relenvencedrop);
        sel.selectByIndex(2);
        //sel.selectByValue("price_desc");

        List<WebElement> prices = driver.findElements(By.cssSelector(".ProductCardstyles__PriceContainer-l8f8q8-13.lcxskn"));
        for (WebElement price : prices) {
            System.out.println(price.getText());

            //if (price.getText().contains("£529.00")) {
               // price.click();
                break;

            }

        }
    }
//saj.feature
// dev
// saj

// master
//dev







