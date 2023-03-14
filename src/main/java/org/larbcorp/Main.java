package org.example;

import feign.Feign;
import feign.gson.GsonDecoder;
import org.larbcorp.OpenExchangeRatesApiService.ExchangeRate;
import org.larbcorp.OpenExchangeRatesApiService.OpenExchangeRatesApi;

public class Main {
    public static void main(String[] args) {

        OpenExchangeRatesApi openExchangeRatesApi = Feign.builder()
                .decoder(new GsonDecoder())
                .target(OpenExchangeRatesApi.class, "https://openexchangerates.org");

        ExchangeRate exchangeRate = openExchangeRatesApi.getExchangeRate("3228872d4dd44f5586fcf046accad6c4", "USD,JPY,EUR");

        System.out.println(exchangeRate.getRates().entrySet());

    }
}