package ru.technoserv.atmaven.tests;

import ru.technoserv.atmaven.tests.SPages.VTBPage;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$x;

public class VtbCalc {

    private VTBPage page;
    @BeforeClass
    public void before() {
        page = VTBPage.getCurrencyPage();
        $x("//*[@id=\"cookiemsgoffpls\"]/p[1]").click();
    }

    @Test
    public void firstTest() {
        double rur = 1223.23;
        double result = page.getRuToUs(rur);
        Assert.assertNotEquals(result, 0.0);
        Assert.assertTrue(rur > result);
    }

    @Test
    public void secondTest() {
        double usd = 121.23;
        double result = page.getUsToRu(usd);
        Assert.assertNotEquals(result, 0.0);
        Assert.assertTrue(usd < result );
    }

    @Test
    public void thirdTest() {
        double rur = 55000.0;
        double result = page.getRuToEu(rur);
        Assert.assertNotEquals(result, 0.0);
        Assert.assertTrue(rur > result);
    }

    @Test
    public void forthTest() {
        double eur = 5;
        double result = page.getEuToRu(eur);
        Assert.assertNotEquals(result, 0.0);
        Assert.assertTrue(eur < result);
    }

    @Test
    public void fifthTest() {
        double result = page.getUsToEu(1.0);
        System.out.println(result);
        System.out.println(page.getEuToUs(result));
    }

    @Test
    public void sixTest() {
        double result = page.getUsToEu(2.0);
        System.out.println(result);
        System.out.println(page.getEuToUs(result));
    }
}
