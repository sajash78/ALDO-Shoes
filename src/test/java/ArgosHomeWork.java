import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ArgosHomeWork {
    public static WebDriver driver;
    @Before
    public void setup(){ //method
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
    } // end of method
    @Test

    public void ArgosHome(){
      //  WebElement openchromebrowers= driver.findElement(By.xpath("body.srp.tbo.vasq:nth-child(2) div.big:nth-child(4) div.mw:nth-child(11) div.col:nth-child(2) div.med:nth-child(3) div.g:nth-child(1) div.rc:nth-child(2) div.r a:nth-child(1) div.TbwUpd.NJjxre:nth-child(3) > cite.iUh30.tjvcx"));
        //openchromebrowers.click();

        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("nike");
        WebElement searchbutton= driver.findElement(By.className("_1gqeQ"));
        searchbutton.click();
        WebElement nikearmband = driver.findElement(By.cssSelector("div.app.app--search-lister div.bolt-v2.container.container--findability:nth-child(3) div.bolt-v2.search:nth-child(7) div.xs-row.xs-auto--negative.lg-auto--none.search__content:nth-child(1) div.xs-12--none.lg-9--none.xs-stack.search__container:nth-child(5) div.xs-block.sm-row.xs-auto--none.sm-auto--none.md-auto--none.lg-auto--negative.product-list div.ProductCardstyles__Wrapper-l8f8q8-1.dcYzYG.xs-block.md-row.xs-auto--none.sm-6.md-4.findability-product:nth-child(1) div.ProductCardstyles__ContentBlock-l8f8q8-5.htYUlF div.ProductCardstyles__ImageContainer-l8f8q8-2.ehSApA:nth-child(2) div.ProductCardstyles__ImageWrapper-l8f8q8-3.hocfCx div:nth-child(1) picture:nth-child(1) > img:nth-child(3)"));
        nikearmband.click();
        WebElement addtotrolley =driver.findElement(By.cssSelector("body.pdp-body:nth-child(2) div.pdp-main.pdp-main--default div.container:nth-child(1) div.xs-block section.xs-12--none.md-5--none.xl-4--none.pdp-right:nth-child(2) section.pdp-pricing-module.bolt-v2 div:nth-child(14) div.xs-row.add-to-trolley-main.top-border div.xs-8--none > button.Buttonstyles__Button-q93iwm-2.enxOSK"));
        addtotrolley.click();
        WebElement gototrolley =driver.findElement(By.cssSelector("body.pdp-body:nth-child(2) div.pdp-main.pdp-main--default div.container:nth-child(1) div.xs-block section.xs-12--none.md-5--none.xl-4--none.pdp-right:nth-child(2) section.pdp-pricing-module.bolt-v2 div.Drawerstyles__Wrapper-mvyw7g-0.eShFua div.Drawerstyles__Container-mvyw7g-1.kxzkDf footer.Drawerstyles__Footer-mvyw7g-6.kRlCeH div.xs-row div.Modalstyles__ButtonSpacer-m74fhr-2.hPvarY.xs-12.sm-6--none.xs-order-1.sm-order-2:nth-child(2) > a.Buttonstyles__Button-q93iwm-2.enxOSK"));
        gototrolley.click();
        driver.navigate().back();
    }// End of method.

}// end of class
