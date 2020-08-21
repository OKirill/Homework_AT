package ru.technoserv.atmaven.tests.my.tests;


import ru.technoserv.atmaven.tests.pages.openbank.OpenBankUrl;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class JustSelenide {

    @Test
    public void withSelenide() {
        OpenBankUrl sample = open("https://www.open.ru", OpenBankUrl.class);

        System.out.println("USD: " + sample.getUBuy() + " / " + sample.getUSell());
        System.out.println("EUR: " + sample.getEBuy() + " / " + sample.getESell());
        Assert.assertTrue(sample.getUBuy() < sample.getUSell());
        Assert.assertTrue(sample.getEBuy() < sample.getESell());

    }
}