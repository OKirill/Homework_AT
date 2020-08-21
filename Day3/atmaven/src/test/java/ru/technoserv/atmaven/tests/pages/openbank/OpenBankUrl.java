package ru.technoserv.atmaven.tests.pages.openbank;

import static com.codeborne.selenide.Selenide.$x;

public class OpenBankUrl {
    public Double getUBuy() {

        return getValueOfCurrency("//tr[2]//td[2]//*[@class=\"main-page-exchange__rate\"]");
    }
    public Double getUSell() {

        return getValueOfCurrency("//tr[2]//td[4]//*[@class=\"main-page-exchange__rate\"]");
    }
    public Double getEBuy() {

        return getValueOfCurrency("//tr[3]//td[2]//*[@class=\"main-page-exchange__rate\"]");
    }
    public Double getESell() {
        return getValueOfCurrency("//tr[3]//td[4]//*[@class=\"main-page-exchange__rate\"]");
    }
    private Double getValueOfCurrency(String path) {
        return Double.parseDouble($x(path).getText().replace(",","."));
    }
}