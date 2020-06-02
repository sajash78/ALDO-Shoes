package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class NewSelectClass {
    public static WebDriver driver;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/smartwatch-band/?clickOrigin=searchbar:search:auto:smart+watches:smartwatch+band");
        driver.manage().window().maximize();
    }
@Test
    public void smartWaches(){

    WebElement brands = driver.findElement(By.cssSelector(".Checkboxstyles__LabelWrapper-e3lxpy-5.ixjOsX"));
    brands.click();


}

}
