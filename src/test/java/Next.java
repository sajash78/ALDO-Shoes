import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Next {
    public static WebDriver driver;

       @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();

       }// end of method
@Test
    public void shop(){

    WebElement searchbox =driver.findElement(By.id("sli_search_1"));
    searchbox.sendKeys("SHOES");
    WebElement searchbutttom =driver.findElement(By.className("SearchButton"));
    searchbox.click();
    WebElement Seeall=driver.findElement(By.className("SearchButton"));
    Seeall.click();
    WebElement MENS =driver.findElement(By.xpath("//a[contains(text(),'Mens')]"));
    MENS.click();
    WebElement ADDTOBAG =driver.findElement(By.xpath("//article[1]//section[1]//div[2]//a[1]//img[1]"));
    ADDTOBAG.click();
    WebElement shoesize = driver.findElement(By.xpath("//body/section/section/div/div/div/div/section/article[1]/section[1]/div[4]/div[2]/div[1]/div[1]/a[1]"));
    shoesize.click();
    WebElement size = driver.findElement(By.xpath("//article[1]//section[1]//div[4]//div[2]//div[1]//div[1]//div[1]//ul[1]//li[10]//a[1]"));
    size.click();
    //WebElement size9 = driver.findElement(By.xpath("//article[1]//section[1]//div[4]//div[2]//div[1]//div[1]//div[1]//ul[1]//li[9]//a[1]"));
    //size9.click();
   // WebElement addtobag1 = driver.findElement(By.cssSelector("body.font-antialiased.bp1280.bp1440.JSEnabled.webkit:nth-child(2) section.ContentArea.LargeHeader:nth-child(32) section.CurrentContent:nth-child(1) div.ppContainer div.ProductPage.OverflowFixer.HorizontalStyleWith:nth-child(5) div.Content:nth-child(6) div.itemsContainer section.ProductDetail article.Style.FirstItem.Grouped.LastItem.Selected:nth-child(4) section.StyleCopy div.StyleForm div:nth-child(5) div.BagHolder div.AddToBag > a.nxbtn.primary.btn-addtobag.addToBagCTA.Enabled:nth-child(1)"));
    //addtobag1.click();
    WebElement checkout =driver.findElement(By.className("//html//body//header//div//section//div//a[contains(text(),'Checkout')]"));
    checkout.click();

    driver.navigate().refresh();


}

} // end of class
