package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SainsburysSelectClass {

    public static WebDriver driver;
    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
       // driver.get("https://www.sainsburys.co.uk/");
        driver.get("https://www.habitat.co.uk/lighting/shop-by-category/table-lamps");
        driver.manage().window().maximize();
    }
    @Test
    public void practise() {
       // WebElement searchbox = driver.findElement(By.id("searchTerm"));
        //searchbox.sendKeys("nike");
       // WebElement searchbutton = driver.findElement(By.xpath("//body//header//div//div//div//div//span[2]"));
        //searchbutton.click();
     //  WebElement category = driver.findElement(By.id("category"));
        //category.click();

        //Select sel = new Select(category);
        //sel.selectByIndex(1);

        List<WebElement> lamps = driver.findElements(By.cssSelector(".price-box"));
        for (WebElement lamp:lamps){
            System.out.println(lamp.getText());
            if (lamps.contains("£65.00")){
                lamp.click();
            break;
            }


        }
}}