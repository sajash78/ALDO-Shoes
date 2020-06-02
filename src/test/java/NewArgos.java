import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NewArgos {
    public static WebDriver driver;

    @Before
    public void setup (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    }

    @Test

    public void argos(){
        WebElement searchbox= driver.findElement(By.cssSelector("#searchTerm"));
        searchbox.sendKeys("toy");
        WebElement searchboxbutton =driver.findElement(By.cssSelector("._2mKaC"));
        searchboxbutton.click();
       WebElement speedcar =driver.findElement(By.xpath("//body//div//div//div//div//div//div//div[1]//div[1]//a[1]//div[1]//div[2]//div[1]//picture[1]//img[1]"));
       speedcar.click();
       WebElement postcode =driver.findElement(By.cssSelector(".Inputstyles__Input-sc-16q3xlm-7.SearchStockstyles__SearchInput-sc-1olt28i-3.eOkmrC"));
       postcode.sendKeys("ub54qn");
       WebElement checkbox= driver.findElement(By.cssSelector(".Buttonstyles__Button-q93iwm-2.cdNSlJ.SearchStockstyles__SearchButton-sc-1olt28i-4.dGQyB"));
       checkbox.click();
       WebElement addtotrolley =driver.findElement(By.cssSelector(".Buttonstyles__Button-q93iwm-2.cdNSlJ.SearchStockstyles__SearchButton-sc-1olt28i-4.dGQyB"));
       addtotrolley.click();
    }



}// class end
