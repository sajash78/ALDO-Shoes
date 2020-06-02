package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
      // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/");
        driver.manage().window().maximize();
    }

    @Test
    public  void implcity(){
        WebElement loginbutton =  driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginbutton.click();

        WebElement  username= driver.findElement(By.id("user_email"));
        username.sendKeys("test");
    }

    @Test
    public void explicit(){

        //WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        //username.sendKeys("test");

    }
}
