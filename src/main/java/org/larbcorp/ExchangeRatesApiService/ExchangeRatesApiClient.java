package org.larbcorp.ExchangeRatesApiService;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.larbcorp.models.ExchangeRate;

public interface ExchangeRatesApiClient {
    @Headers("Content-Type: application/json")
    //https://openexchangerates.org/api/historical/2022-01-01.json?app_id=3228872d4dd44f5586fcf046accad6c4&symbols=USD,JPY,EUR
    @RequestLine("GET /api/historical/{date}.json?app_id={appId}&symbols={symbols}")
    ExchangeRate getTodayExchangeRate(@Param("appId") String appId, @Param("symbols") String symbols, @Param("date") String date);

}
