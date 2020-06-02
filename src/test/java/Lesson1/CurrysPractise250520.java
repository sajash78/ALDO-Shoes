package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CurrysPractise250520 {
    public static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.currys.co.uk/gbuk/index.html");
        driver.manage().window().maximize();
    }
    @Test
    public void travel() throws InterruptedException {
        WebElement computing = driver.findElement(By.xpath("//body/div/div/div/div/div/ul/li[3]/a[1]"));
        Thread.sleep(2000); //body/div/div/div/div/div/ul/li[3]/a[1]
        Actions action = new Actions(driver); // mouseHover
        action.moveToElement(computing).perform();

        Thread.sleep(2000);
       WebElement laptop = driver.findElement(By.xpath("//li[3]//ul[1]//li[7]//div[1]//a[1]"));
       action.moveToElement(laptop).click().perform();// sub element of mouse hover dropdown therfore u req .click
       WebElement relevance = driver.findElement(By.cssSelector(".dc-select-input"));
       //relevance.click();
       Select sel = new Select(relevance);
       sel.selectByValue("brand-asc/Brand - A to Z");

       // driver.quit();


    }
}
