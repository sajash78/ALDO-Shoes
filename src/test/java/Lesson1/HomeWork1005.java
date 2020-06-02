package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork1005 {
    static WebDriver driver;
    @Before
    public void setup(){

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/search/nike/");
        driver.manage().window().maximize();

    }
@Test
    public void argos(){
    //WebElement searbox =driver.findElement(By.id("searchTerm"));
    //searbox.sendKeys("nike");

    //WebElement searchButton= driver.findElement(By.cssSelector("div.app header._1TMAp div._3-aaF div._1ni9g div.AOlDC div.GXIub:nth-child(1) form._7blr5 button._2mKaC > span._1gqeQ"));
    //searchButton.click();

   // WebElement priceRange = driver.findElement(By.cssSelector(".Checkboxstyles__LabelValue-e3lxpy-6.fOQrQk"));
   // priceRange.click();

    WebElement header = driver.findElement(By.name("search-title"));
    String actual = header.getText();
    Assert.assertEquals("nike",actual);
    Assert.assertThat(actual, Matchers.containsString("nike"));
    }
}
