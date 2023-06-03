package org.larbcorp.ExchangeRatesApiService.ExchangeRatesServiceImpl;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesApiClient;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesService;
import org.larbcorp.models.ExchangeRate;

import java.time.LocalDate;

public class ExchangeRatesServiceImpl implements ExchangeRatesService {

    LocalDate currentDate = LocalDate.now();
    LocalDate yesterdayDate = currentDate.minusDays(1);

    ExchangeRatesApiClient exchangeRatesApiClient = Feign.builder()
        .decoder(new JacksonDecoder())
        .target(ExchangeRatesApiClient.class, "https://openexchangerates.org");

    public String CurComparison(String currencyName) {

        ExchangeRate exchangeRate = exchangeRatesApiClient.
            getTodayExchangeRate("3228872d4dd44f5586fcf046accad6c4",
            currencyName,
            currentDate.toString());
        ExchangeRate exchangeRateYesterday = exchangeRatesApiClient.
            getTodayExchangeRate("3228872d4dd44f5586fcf046accad6c4",
                currencyName,
                yesterdayDate.toString());

        double yesterdayExchangeRateValue = exchangeRateYesterday.getRates().values().stream().findFirst().orElseThrow();
        double exchangeRateValue = exchangeRate.getRates().values().stream().findFirst().orElseThrow();
//
//        System.out.println(yesterdayExchangeRateValue + " yesterdayExchangeRateValue");
//        System.out.println(exchangeRateValue + " exchangeRateValue");


        if(exchangeRateValue > yesterdayExchangeRateValue)
            return "rich";
        if(exchangeRateValue < yesterdayExchangeRateValue)
            return "broke";
        if(exchangeRateValue == yesterdayExchangeRateValue)
            return "rich";

        return null;
    }
}
