package org.larbcorp;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesService;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesServiceImpl.ExchangeRatesServiceImpl;
import org.larbcorp.GifsApiService.GifApiServiceImpl.GifApiServiceImpl;
import org.larbcorp.models.ExchangeRate;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesApiClient;
import org.larbcorp.GifsApiService.GiphyApiClient;

import java.time.LocalDate;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


        ExchangeRatesServiceImpl exchangeRatesService = new ExchangeRatesServiceImpl();

        // System.out.println(exchangeRatesService.CurComparison("USD"));
        String value = exchangeRatesService.CurComparison("EUR");

        GifApiServiceImpl gifApiService = new GifApiServiceImpl();
        System.out.println("getGifUrl " + gifApiService.getGifUrl(value));


    }
}



