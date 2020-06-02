import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Amazon2 {
    public static WebDriver driver;

        @Before

        public void       setup(){ //start of my method..
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.amazon.co.uk/");
            driver.manage().window().maximize();
        } //end of my method.
    @Test
    public  void  Amazon2(){
            WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
            searchbox.sendKeys("TV");
            WebElement searchboxbutton = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
            searchboxbutton.click();
            WebElement firetv= driver.findElement(By.xpath("//div[@class='sb_3AXzcZxp']//img"));
            firetv.click();
            WebElement firetvstick =driver.findElement(By.cssSelector("body.a-aui_157141-c.a-aui_72554-c.a-aui_dropdown_187959-c.a-aui_pci_risk_banner_210084-c.a-aui_perf_130093-c.a-aui_tnr_v2_180836-c.a-aui_ux_145937-c.a-meter-animate:nth-child(2) div.a-fixed-left-flipped-grid.s-padding-left-small.s-padding-right-small.s-span-page.a-spacing-top-small:nth-child(31) div.a-fixed-left-grid-inner div.a-fixed-left-grid-col.a-col-right:nth-child(1) div.lp.s-padding-left-small.twoColumn div.a-section:nth-child(2) div.a-row.s-result-list-parent-container:nth-child(3) ul.s-result-list.s-col-1.s-col-ws-1.s-result-list-hgrid.s-height-equalized.s-list-view.s-text-condensed.s-item-container-height-auto li.s-result-item.celwidget:nth-child(1) div.s-item-container div.a-fixed-left-grid div.a-fixed-left-grid-inner div.a-fixed-left-grid-col.a-col-left:nth-child(1) div.a-row div.a-column.a-span12.a-text-center a.a-link-normal.a-text-normal > img.s-access-image.cfMarker"));
            firetvstick.click();
            WebElement addtobasket= driver.findElement(By.id("add-to-cart-button"));
            addtobasket.click();

    }












}// end of my class
