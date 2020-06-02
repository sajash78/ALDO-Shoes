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

public class PracticeSelectClass110520 {

    public static WebDriver driver;
        @Before
        public void setup(){

            // System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            driver.get("https://www.argos.co.uk/");
            driver.manage().window().maximize();
}
@Test
    public void practise() {
    WebElement searchbox = driver.findElement(By.id("searchTerm"));
    searchbox.sendKeys("nike");
    WebElement searchbutton = driver.findElement(By.xpath("//body//header//div//div//div//div//span[2]"));
    searchbutton.click();
    WebElement relevancebox = driver.findElement(By.id("sort-select"));
    relevancebox.click();

    Select sel = new Select(relevancebox);
    sel.selectByIndex(1);
    //sel.selectByValue("Price: Low - High");

    List<WebElement> prices = driver.findElements(By.cssSelector(".ProductCardstyles__TextContainer-l8f8q8-6.fDOdUb"));
    for (WebElement price:prices){ System.out.println(price.getText());
        if (price.getText().equals("£9.99")){
        price.click();
       break;
        }
    } }

}

