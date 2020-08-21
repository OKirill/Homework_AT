package ru.technoserv.atmaven.tests.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    private static String chromeDriverPath = "D:/chromedriver.exe";

    public static ChromeDriver initCD() {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
    }
}