import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RadioButton { // j-unit = @ before @ test
    public static WebDriver driver;

    @Before
    public void setup(){ // set up method starts
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/");
        driver.manage().window().maximize();
    } // set up method ends

    @Test
    public void RadioButton(){
        WebElement practisepage = driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link']"));
        practisepage.click();

        WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
        bmwRadioButton.click();

        WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
        benzRadioButton.click();

       // driver.navigate().back();
       // driver.navigate().forward();
       // driver.navigate().to("https://www.amazon.co.uk/");
    }// radio button method ends
    @After
    public void teardown(){
        driver.quit();
      //  driver.close();
    }
}

