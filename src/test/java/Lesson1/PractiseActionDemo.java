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
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PractiseActionDemo {
    public static WebDriver driver;
    @Before
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void actionDemo() throws InterruptedException {
        String action2 = driver.getCurrentUrl();
        Assert.assertThat(action2, Matchers.containsString("next"));


        WebElement mouseHover= driver.findElement(By.xpath("//header//li[2]//a[1]//span[1]"));
        Thread.sleep(3000);

        Actions action = new Actions(driver);
        action.moveToElement(mouseHover).perform();

        WebElement jeans = driver.findElement(By.linkText("Jeans"));
        action.moveToElement(jeans).click().perform();

    }
@Test
    public void practise(){
        WebElement mouseHover = driver.findElement(By.xpath("//li[12]//a[1]//span[1]"));

        Actions action = new Actions(driver);
        action.moveToElement(mouseHover).perform();

        WebElement Eid =driver.findElement(By.linkText("Eid"));
        action.moveToElement(Eid).click().perform();
}

}

