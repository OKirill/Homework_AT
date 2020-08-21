package ru.technoserv.atmaven.tests;

import java.util.Map;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RestAssured {
    static String LOCALES = "locales";
    static String CURRENCIES = "currencies";
    static String TIMEZONES = "timezones";
    static String CITIES = "cities";
    static String COUNTRIES = "countries";

    static String HOST = "wft-geo-db.p.rapidapi.com";
    static String KEY = "1634d42783msh9255a722d4d3021p15c664jsn2f0cd83c85d0 ";
    static Map<String, String> baseUrl = Map.of(
            LOCALES,"https://wft-geo-db.p.rapidapi.com/v1/locale/locales",
            CURRENCIES, "https://wft-geo-db.p.rapidapi.com/v1/locale/currencies",
            TIMEZONES, "https://wft-geo-db.p.rapidapi.com/v1/locale/timezones",
            CITIES, "https://wft-geo-db.p.rapidapi.com/v1/geo/cities",
            COUNTRIES, "https://wft-geo-db.p.rapidapi.com/v1/geo/countries"
    );


    @Test
    public void testGetCurrencies() {
        given().
                header("x-rapidapi-host", HOST).
                header("x-rapidapi-key", KEY).
                queryParam("offset", "5").
                queryParam("limit", "10").
                when().
                get(baseUrl.get(CURRENCIES)).
                then().
                assertThat().
                body("metadata.totalCount", equalTo(205));
    }

    @Test
    public void testGetTimezones() {
        given().
                header("x-rapidapi-host", HOST).
                header("x-rapidapi-key", KEY).
                when().
                get(baseUrl.get(TIMEZONES)).
                then().
                assertThat().
                body("data[2].name", equalTo("GMT-9:00"));
    }

    @Test
    public void testGetCities() {
        given().
                header("x-rapidapi-host", HOST).
                header("x-rapidapi-key", KEY).
                when().
                get(baseUrl.get(CITIES)).
                then().
                assertThat().
                body("data[3].name", equalTo("El Tarter"));
    }

    @Test
    public void testGetCountries() {
        given().
                header("x-rapidapi-host", HOST).
                header("x-rapidapi-key", KEY).
                when().
                get(baseUrl.get(COUNTRIES)).
                then().
                assertThat().
                body("links[1].rel", equalTo("next"));
    }

    @Test
    public void testGetLocales() {
        given().
                header("x-rapidapi-host", HOST).
                header("x-rapidapi-key", KEY).
                queryParam("offset", "59").
                when().
                get(baseUrl.get(LOCALES)).
                then().
                assertThat().
                body("metadata.currentOffset", equalTo(59)).
                body("metadata.totalCount", equalTo(772));
    }

}

