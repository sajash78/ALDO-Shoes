package Lesson1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Aldo {
    public static WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.aldoshoes.com/uk/en_UK");
        driver.manage().window().maximize();
    }
    @Test
    public void menShoes() throws InterruptedException, IOException {
        Thread.sleep(3000);
        WebElement men = driver.findElement(By.xpath("//body/div/div/div/div/header/div/div/nav/ul/li[3]/button[1]/span[1]/span[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(men).perform();
        Thread.sleep(3000);
        WebElement laofer = driver.findElement(By.xpath("//li[3]//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[2]//ul[1]//li[3]//a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(laofer).click().perform();
        WebElement relevance = driver.findElement(By.id("ProductLandingSortOptionsDropdown"));
       // relevance.click();
        Thread.sleep(3000);
        Select sel = new Select(relevance);
        sel.selectByVisibleText("Price (high to low)");
        Thread.sleep(3000);
        WebElement drorelianshoes = driver.findElement(By.xpath("//li[3]//div[1]//a[1]//span[1]//picture[1]//img[1]"));
        drorelianshoes.click();
        Thread.sleep(3000);
        //WebElement sizes = driver.findElement(By.cssSelector(".c-product-option-list__list-item.o-option-rectangle.o-option-rectangle--size"));
        List<WebElement>sizes= driver.findElements(By.cssSelector(".c-product-option-list__list-item.o-option-rectangle.o-option-rectangle--size"));
        for (WebElement size:sizes){
            System.out.println(size.getText());

            if (size.getText().contains("11")){
                size.click();
                Thread.sleep(2000);

        driver.quit();

    }

}
    }
}
