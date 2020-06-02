import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Amazon  { // start of class
    public static WebDriver driver;

    @Before

    public void setup(){ // start of method
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
    }// end of method.

    @Test

    public void Amazon(){ // start of test
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("HARRY POTTER");
        WebElement NAV = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
        NAV.click();

        WebElement TOP = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-result-item s-flex-full-width s-widget']//div[2]//div[1]//a[1]//div[1]//img[1]"));
        TOP.click();
        WebElement greytop = driver.findElement(By.xpath("body.a-aui_72554-c.a-aui_dropdown_187959-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_preload_261698-c.a-aui_tnr_v2_180836-c.a-aui_ux_145937-c.a-meter-animate:nth-child(2) div.apparel.en_GB:nth-child(25) div.a-container:nth-child(6) div.a-section.a-spacing-base.font-smoothing:nth-child(4) div.a-row:nth-child(2) div.a-column.a-span8.a-span-last:nth-child(2) div.a-fixed-right-grid div.a-fixed-right-grid-inner div.a-fixed-right-grid-col.ie7-width-935.a-col-left:nth-child(1) div.feature:nth-child(12) div.addTwisterMargin:nth-child(1) form.a-section.a-spacing-small:nth-child(2) div.a-section.a-spacing-small:nth-child(3) ul.a-unordered-list.a-nostyle.a-button-list.a-declarative.a-button-toggle-group.a-horizontal.a-spacing-top-micro.swatches.swatchesRectangle.imageSwatches li.swatchSelect:nth-child(1) span.a-list-item div.tooltip span.a-declarative span.a-button.a-button-selected.a-button-thumbnail.a-button-toggle span.a-button-inner button.a-button-text div:nth-child(2) div:nth-child(1) > img.imgSwatch"));
        greytop.click();
        //WebElement thrilla = driver.findElement(By.xpath("//span[1]//li[1]//span[1]//div[1]//a[1]"));
        //thrilla.click();




    } // end of the test.




} // end of class


