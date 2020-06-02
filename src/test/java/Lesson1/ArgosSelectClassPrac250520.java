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

public class ArgosSelectClassPrac250520 {
 public static WebDriver driver;


 @Before
 public void setup(){
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
     driver.get("https://www.argos.co.uk/");
     driver.manage().window().maximize();

 }
 @Test
  public void relavance() throws InterruptedException {
     WebElement searchbox = driver.findElement(By.id("searchTerm"));
     searchbox.sendKeys("nike");
     WebElement searchButton = driver.findElement(By.xpath("//body//header//div//div//div//div//span[2]"));
     searchButton.click();
     WebElement relavancebox = driver.findElement(By.id("sort-select"));
     relavancebox.click();
     Thread.sleep(3000);
     Select sel = new Select(relavancebox);
     Thread.sleep(3000);
     sel.selectByValue("price_asc");
     Thread.sleep(5000);
     //driver.quit();
 }

    }

