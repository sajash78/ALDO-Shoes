package Lesson1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tesco {// start of class

    public static WebDriver driver;

    @Before
    public void setup(){ // start of method

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.tesco.com/");
        driver.manage().window().maximize();

    }// end of method

    @Test
    public void Tesco(){ // start of test method.
        WebElement search= driver.findElement(By.xpath("//div[@class='search-logo-container']//input[@placeholder='Search']"));
        search.sendKeys("fruit");

        WebElement searchclickbutton = driver.findElement(By.xpath("//div[@class='search-logo-container']//span[@class='ui-icon']"));
        searchclickbutton.click();
        //WebElement

        driver.navigate().back();
        driver.navigate().forward();




    } // of test



}// end of class







