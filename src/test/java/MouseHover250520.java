import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHover250520 {
    public static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.britishairways.com/travel/home/public/en_gb/");
        driver.manage().window().maximize();
}
@Test
    public void britishAirway() throws InterruptedException {
    WebElement registerButton = driver.findElement(By.xpath("//body/div/div/header/section/div/div/form/div[1]/a[1]"));
    Thread.sleep(3000);
    Actions actions= new Actions(driver);
    Thread.sleep(4000);
    actions.moveToElement(registerButton).click().perform();
    driver.quit();


}


}
