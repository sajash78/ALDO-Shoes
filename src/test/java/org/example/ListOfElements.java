package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

public class ListOfElements {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }

    @Test
    public void radioButton() {

        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type=radio]"));
        for (WebElement radiobutton : radiobuttons) {
            System.out.println(radiobutton.getAttribute("value"));
            // System.out.println(radiobutton.getText());// can not able to
           // radiobutton.click();
            if (radiobutton.getAttribute("value").contains("bmw")) {
                radiobutton.click();// it will click on bmw only
            }
        }
    }
}







// end of class
