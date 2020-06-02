package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class currysSelectClass {
    public static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.currys.co.uk/gbuk/computing/laptops/laptops/315_3226_30328_xx_xx/xx-criteria.html");
        driver.manage().window().maximize();

}
@Test
    public void select() throws InterruptedException {
    WebElement relevance= driver.findElement(By.xpath("//html//body//div//div//div//div//section//div//form//div//div//div//div//div//div//div"));
     relevance.click();
    Thread.sleep(4000);
    Select sel = new Select(relevance);
    sel.selectByIndex(2);

}

}
