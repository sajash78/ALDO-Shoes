import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Argos2 { //START OF CLASS
    public static WebDriver driver;
    @Before
    public void setup(){ //method
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    } // end of method
    @Test
    public void Argos2(){

        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("bike");
        WebElement searchbutton = driver.findElement(By.className("_1gqeQ"));
        searchbutton.click();
    }






}// END OF CLASS
