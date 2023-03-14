package org.larbcorp.OpenExchangeRatesApiService;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface OpenExchangeRatesApi {

    @Headers("Content-Type: application/json")
    @RequestLine("GET /api/latest.json?app_id={appId}&symbols={symbols}")
    ExchangeRate getExchangeRate(@Param("appId") String appId, @Param("symbols") String symbols);


}
