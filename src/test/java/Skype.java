import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Skype { // start of class

    public static WebDriver driver;

    @Before
    public void setup(){ //start of method
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.skype.com/en/get-skype/");
        driver.manage().window().maximize(); }

        @Test
    public void Skype(){

            WebElement Skypehome= driver.findElement(By.className("title x-hidden-focus"));
            Skypehome.sendKeys();


        }// test methhod ends

} // end of class
