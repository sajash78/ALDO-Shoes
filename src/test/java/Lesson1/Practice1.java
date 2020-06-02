package Lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 { // start of my class basic method

    public static void main(String[] args) {  // start of method
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.id("searchTerm"));
        searchbox.sendKeys("adidas");

        WebElement clickbox = driver.findElement(By.className("_2mKaC"));
        clickbox.click();
    } // end of  basic method
};


