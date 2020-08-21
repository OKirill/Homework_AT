package ru.technoserv.atmaven.tests.my.tests;

import ru.technoserv.atmaven.tests.ChromeDriver.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RawSelenium {

    WebDriver driver;

    @BeforeClass
    public void StartDriver() {
        driver = BrowserFactory.initCD();
    }

    @Test
    public void withClearSelenium() {
        String baseURL = "https://www.open.ru";

        driver.get(baseURL);

        Double uBuy = getValueOfCurrency("//tr[2]//td[2]//*[@class=\"main-page-exchange__rate\"]");
        Double uSell = getValueOfCurrency("//tr[2]//td[4]//*[@class=\"main-page-exchange__rate\"]");
        Double eBuy = getValueOfCurrency("//tr[3]//td[2]//*[@class=\"main-page-exchange__rate\"]");
        Double eSell = getValueOfCurrency("//tr[3]//td[4]//*[@class=\"main-page-exchange__rate\"]");

        System.out.println("Доллар - Покупка:" + uBuy + "//" + "Продажа: " + uSell + "//" + "\nЕвро - Покупка: " +
                eBuy + "//" + "Продажа: " + eSell);



        Assert.assertTrue(uBuy < uSell);
        Assert.assertTrue(eBuy < eSell);
    }

    @AfterClass
    public void Terminate() {
        driver.quit();
    }

    public Double getValueOfCurrency(String path) {
        return Double.parseDouble(driver.findElement(By.xpath(path)).getText().replace(",","."));
    }
}