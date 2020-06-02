package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutocompleteDropdown {
    public static WebDriver driver;
@Before
    public void setup(){

           // System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
             WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            driver.get("https://www.expedia.co.uk/");
            driver.manage().window().maximize();

    }

    @Test
    public void expedia() throws InterruptedException {
            WebElement location = driver.findElement(By.id("hotel-destination-hp-hotel"));
            System.out.println(location.isEnabled());// the element is able or not true = Enable element.
            location.sendKeys("Del");
            Thread.sleep(3000);

                List<WebElement> destionations = driver.findElements(By.cssSelector(".multiLineDisplay.details"));
                for (WebElement destionation : destionations){
                    System.out.println(destionation.getText());

                    if (destionation.getText().contains("Delhi (DEL - Indira Gandhi Intl.)")){ // copy and paste form DOM not type!!
                        destionation.click();
                        break;
                }
            }
}
}

