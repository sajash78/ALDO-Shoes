import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Coop {
    public static WebDriver driver;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.coop.co.uk/");
        driver.manage().window().maximize();
    }
 @Test
    public void coop1(){
     WebElement Searchbox= driver.findElement(By.id("siteSearch"));
     Searchbox.sendKeys("FOOD");
     WebElement searchboxbutton =driver.findElement(By.xpath("//body[@id='landingPage']/header/div/div/div/form/button[1]//*[local-name()='svg']"));
     searchboxbutton.click();
     WebElement FOOD = driver.findElement(By.xpath("//a[@id='cn_food']//span//*[local-name()='svg']"));
     FOOD.click();
     WebElement CAKES =driver.findElement(By.id("cn_food_recipes_baking"));
     CAKES.click();
     WebElement bakewelltarts = driver.findElement(By.xpath("//h3[contains(text(),'Bakewell traybake')]"));
     bakewelltarts.click();

         }

         @Test
     public void relevancy (){

        WebElement deals = driver.findElement(By.id("cn_deals"));
        deals.click();
        WebElement relevency = driver.findElement(By.cssSelector("#sortBy"));
            relevency.click();
             Select sel =  new Select(relevency);
             sel.selectByIndex(1);

             List<WebElement> options = sel.getOptions();  // to get all options of rev  box
            // List<WebElement> options = sel.getAllSelectedOptions();  //to get only selected  box
             for (WebElement option:options){
                 System.out.println(sel.getOptions());
             }

             List<WebElement> cooptis= driver.findElements(By.cssSelector(".coop-c-card__title"));
             for (WebElement coopti:cooptis){
                 System.out.println(coopti.getText());

                 if (coopti.getText().contains("Irn Bru 1 ltr")){
                     coopti.click();
                    break;
                 }
             }
    }
}







