package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ArgosWishButton {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }

    @Test
    public void Argos(){
        WebElement wishlistbutton= driver.findElement(By.xpath("//body//header//a[3]//*[local-name()='svg']"));
        wishlistbutton.click();

        WebElement StartshoppingButton =driver.findElement(By.xpath("//a[contains(text(),'Start Shopping')]"));
        StartshoppingButton.click();

        WebElement eidmubarak = driver.findElement(By.cssSelector("div.app div.app-content.container:nth-child(2) div.bolt-v2.HomepageContainer__homepage__1k-or div:nth-child(2) div.HomepageComponents__grid-3-col__ByRJj.HomepageComponents__homepage-component-container__3AxmE a.HomepageComponents__homepage-component__1Eq9N.HomepageComponents__homepage-component-13__3xHOX:nth-child(4) picture:nth-child(1) > img:nth-child(3)"));
        eidmubarak.click();

       // WebElement Eidgifts= driver.findElement(By.cssSelector(".Buttonstyles__Button-q93iwm-2.jdYkXh"));
       // Eidgifts.click();
    }
}
