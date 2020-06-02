package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectClass {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");//
        driver.manage().window().maximize();
    }

    @Test

    public void multipleSelect() throws InterruptedException {
        WebElement multipleselect = driver.findElement(By.xpath("//div[3]//fieldset[1]//select[1]"));
        Select sel = new Select(multipleselect);
        sel.selectByVisibleText("Apple");
        //Thread.sleep(2000);
        sel.selectByIndex(1);
       // Thread.sleep(1000);
        sel.selectByValue("peach");
       // Thread.sleep(2000);
        sel.deselectByVisibleText("Orange");
        //only for printing
       // List<WebElement> colours = sel.getAllSelectedOptions();// not required in interview
       // for (WebElement multipselects : colours) {// not required
          //  System.out.println(multipleselect.getText()); // not advice.
        } // for loop end
    }// end of method
 // end of class

    //@Test
    //public void southhallTravel() throws InterruptedException {
      //  driver.navigate().to("https://www.southalltravel.co.uk/");
      //  WebElement datesearchmonth = driver.findElement(By.id("deptdt"));
      //  datesearchmonth.click();
       // WebElement datepicker = driver.findElement(By.cssSelector(".ui-datepicker-month"));
       // datepicker.click();

       // Select sel = new Select(datepicker);
       //// sel.deselectByVisibleText("May");
      //  Thread.sleep(4000);
      //  sel.deselectByVisibleText("Jun");
       // Thread.sleep(4000)  ;
       // sel.deselectByVisibleText("Jul");
       // Thread.sleep(4000);
        // sel.selectByValue("8");
        // Thread.sleep(4000);
        // sel.selectByValue("9");
        // sel.selectByIndex(6);
        // sel.selectByIndex(6);
        // sel.selectByIndex(7);




