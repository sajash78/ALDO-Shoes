package org.example;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalanderExample {

    public static WebDriver driver;

        @Before
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.southalltravel.co.uk/?gclid=EAIaIQobChMI64bLy9Kf6QIVB7DtCh1CegqLEAAYASAAEgK6iPD_BwE");
            driver.manage().window().maximize();
    }

    @Test
    public void southHall() {

        List<WebElement> alldates = driver.findElements(By.cssSelector(".ui-state-default"));//
        for (WebElement date : alldates) {
            System.out.println(date.getText());

            if (date.getText().equals("5")) {
                date.click();

            }
        }



    }
   // @Test
      // public void exepdia() {
        //WebElement flightbutton = driver.findElement(By.id("//body/meso-native-marquee/section/div/div/div/section/div/div/div/ul/li[1]/button[1]/span[1]"));
        //flightbutton.click();
        //WebElement departingbox = driver.findElement(By.id("flight-departing-hp-flight"));
        //departingbox.click();

        //WebElement Maycalandermonth = driver.findElement(By.cssSelector("body.wrap.cf:nth-child(2) section.hero-banner-wrap.wizard-hero.mercury.hero-no-title.background.d-col-ads.core-wizard-loaded.siteid-3.theme-inverse-hero div.hero-banner.background.native-marquee.expanded div.hero-banner-gradient.native-marquee:nth-child(1) div.cols-row.hero-banner-inner:nth-child(1) div.hero-banner-box.siteId-3.cf.hideClassicDcol div.cols-row.theme-inverse-pills.wizard-tabs.cols-nested.inline-fields:nth-child(2) div.tabs-container.col section.tab-pane.cf.gcw-section-flights-tab.on:nth-child(1) form.gcw-form.flights.gcw-prepopulate-flying-from.gcw-grey-out-irrelevant-dates.flexible-shopping-form.gcw-traveler-selector.gcw-oneway-packages.gcw-lessThanNTravelers-travelerSelector.gcw-unattendedInfantInLap-travelerSelector.gcw-childAgesAllProvided-travelerSelector.gcw-allFlightsComplete.gcw-allOriginsAreDifferentFromDestinations.gcw-dynamic-leg-fields.field-border-in-high-contrast-mode fieldset.room-data:nth-child(5) div.cols-nested div.col.gcw-date-field:nth-child(2) div.datepicker.theme-standard.pin-left.datepicker-open div.datepicker-dropdown div.datepicker-cal div.datepicker-cal-month:nth-child(4) table.datepicker-cal-weeks tbody.datepicker-cal-dates tr:nth-child(1) > td:nth-child(2)"));
        //List<WebElement> alldates = Maycalandermonth.findElements(By.xpath("//div//div//div//div//div//div//div//div//div[2]//table[1]//tbody[1]//tr[2]//td[4]//button[1]"));
        //for (WebElement alldate : alldates)
          //  System.out.println(alldate.getText());

            }



      //  }


