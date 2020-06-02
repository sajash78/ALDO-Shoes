package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownOptions {
    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }
@Test
    public void DropDownDemo() throws InterruptedException {
    WebElement Dropdownoption= driver.findElement(By.id("DestinationTo"));
     Select sel = new Select(Dropdownoption);
     sel.selectByIndex(0);


    //List<WebElement> Options= sel.getAllSelectedOptions();
   //List<WebElement>Options= sel.getOptions();
   // for (WebElement option: Options){
       // System.out.println(option.getText());
    } // for loop end
    }// end of method
//} // end of class





