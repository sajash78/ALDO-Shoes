package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionDemo {
    static WebDriver driver;
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
public void argos(){
      String actual = driver.getCurrentUrl(); // this is to validate the url is correct or not, this you can do for any thing.
    //Assert.assertThat(actual,Matchers.endsWith("argos.co.uk/"));
      Assert.assertThat(actual, Matchers.equalToIgnoringCase("https://www.argos1.co.uk/"));


      //Assert.assertThat(actual, Matchers.greaterThan("9.00"));
    //Assert.assertThat(actual,Matchers.endsWith("CO.UK"));
     //Assert.assertThat(actual,Matchers.containsString("nike mens"));
    //Assert.assertThat(actual, Matchers.equalToIgnoringCase("argos.co.uk"));
    //Assert.assertThat((actual,Matchers.greaterThanOrEqualTo("5"));
   // Assert.assertThat(actual,Matchers.lessThanOrEqualTo("10.00"));
    //WebElement searchbox = driver.findElement();
   /// searchbox.click();
   // WebElement searchbutton = driver.findElement();

}
}
