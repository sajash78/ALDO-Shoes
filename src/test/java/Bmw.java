import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Bmw{

    public static WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }
@Test
public void benz(){

    WebElement practisepage = driver.findElement(By.cssSelector("head"));
    practisepage.click();
    WebElement bmw =driver.findElement(By.xpath("//div[@id='radio-btn-example']//label[1]"));
    bmw.click();
    WebElement BENZ =driver.findElement(By.id("benzradio"));
    BENZ.click();
    WebElement Honda =driver.findElement(By.id("hondaradio"));
    Honda.click();



    }


} // class end


