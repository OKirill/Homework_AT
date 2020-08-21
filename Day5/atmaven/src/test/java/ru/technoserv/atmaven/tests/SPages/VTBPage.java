package ru.technoserv.atmaven.tests.SPages;

import static com.codeborne.selenide.Selenide.*;

public class VTBPage {
    private static String  url = "https://www.vtb.ru/personal/platezhi-i-perevody/obmen-valjuty/";
    static String USD = "USD";
    static String RUR = "RUR";
    static String EUR = "EUR";



    private void firstexchangemethod(String val) {
        $x("//input[@id=\"method1\"]/../../div[3]").click();
        $x("//input[@id=\"method1\"]/../..//li[contains(.,\"" + val + "\")]").click();
    }
    private void secondexchangemethod(String val) {
        $x("//input[@id=\"method2\"]/../../div[3]").click();
        $x("//input[@id=\"method2\"]/../..//li[contains(.,\"" + val + "\")]").click();
    }
    private void exchangeMethod (String have, String want) {
        firstexchangemethod(have);
        secondexchangemethod(want);
    }

    public static VTBPage getCurrencyPage() {
        return open(url, VTBPage.class);
    }

    // get(то, что имеем)To(то, что хотим получить)
    public Double getRuToUs (Double rub) {
        return getCourse(rub, RUR, USD);
    }
    public Double getRuToEu (Double rub) {
        return getCourse(rub, RUR, EUR);
    }
    public Double getUsToRu (Double usd) {
        return getCourse(usd, USD, RUR);
    }
    public Double getUsToEu(Double usd) {
        return getCourse(usd, USD, EUR);
    }
    public Double getEuToRu (Double eur) {
        return getCourse(eur, EUR, RUR);
    }
    public Double getEuToUs (Double eur) {
        return getCourse(eur, EUR, USD);
    }
    private Double getCourse (Double val, String v1, String v2) {
        exchangeMethod(v1, v2);

        $x("//input[@id=\"method1\"]").clear();
        String expV = $x("//input[@id=\"method2\"]").val();
        $x("//input[@id=\"method1\"]").sendKeys(val.toString().replace(".",","));
        $x("//input[@id=\"method1\"]/../../../label").click();
        String result  = expV;
        for (int i = 0; i < 10; i++) {
            result = $x("//input[@id=\"method2\"]").val();
            if (expV.equals(result) || result.equals("0")) {
                try {
                    Thread.sleep(500);
                } catch (Exception ignored) {}
            } else {
                break;
            }
        }
        
        result = result.replaceAll("\u00a0", "").replace(",",".");
        return Double.parseDouble(result);
    }
}

