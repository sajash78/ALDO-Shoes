import Lesson1.Practice1;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox {

    public static WebDriver driver;

    @Before
    public void setup(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/");
        driver.manage().window().maximize();
    }// end of method

    @Test
    public void Checkbox() {
       // WebElement practispage = driver.findElement(By.className("fedora-navbar-link navbar-link"));
      //  practispage.click();

        WebElement practisebox=driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link']"));
        practisebox.click();

       WebElement bmwcheckbox=driver.findElement(By.id("bmwcheck"));
      bmwcheckbox.click();

        WebElement BenzButtton=driver.findElement(By.id("benzcheck"));
       BenzButtton.click();

        WebElement HondaButton =driver.findElement(By.id("hondacheck"));
        HondaButton.click();




    }







}// end of class



