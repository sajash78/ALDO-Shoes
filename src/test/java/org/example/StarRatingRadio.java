package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StarRatingRadio {
    public static WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/nike/?clickOrigin=searchbar:home:term:nike"); // cut the home pg and going straight in
        //driver.get("\"https://www.argos.co.uk/"); // the home page url, which then requires 2 steps in webElemnt under @ test.
        driver.manage().window().maximize();
    }
@Test
    public void starRating (){

    JavascriptExecutor js = (JavascriptExecutor) driver; // as the pages is not scrolling down
   js.executeScript("window.scrollBy(0,800);"); // the size of the window is variable.

    List<WebElement> radiobuttons = driver.findElements(By.cssSelector(".RadioListstyles__Label-sc-4132xt-5.gywEET"));//common locator.
    for (WebElement radiobutton : radiobuttons) {
        System.out.println(radiobutton.getAttribute("id")); // common attribute (means in all locators)

        if (radiobutton.getAttribute("id").contains("4 or more-label")) {
            radiobutton.click();
        }
    }
}
}
