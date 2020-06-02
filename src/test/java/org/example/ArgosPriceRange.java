package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArgosPriceRange {

    public static WebDriver driver;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void priceRange () {
        WebElement searchbox = driver.findElement(By.id("searchTerm"));// Always needed
        searchbox.sendKeys("nike");

         WebElement searchbutton =driver.findElement(By.xpath("//body//header//div//div//div//div//span[2]")); // again must set these lines up beforehand.
        searchbutton.click();

        List<WebElement> priceranges = driver.findElements(By.cssSelector("label[name=price]"));
        for (WebElement pricerange : priceranges) {
            System.out.println(pricerange.getAttribute("Value"));

            if (pricerange.getAttribute("value").contains("£10 - £15")){
                pricerange.click(); }
    }
    }
}

