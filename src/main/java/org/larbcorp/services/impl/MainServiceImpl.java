package org.larbcorp.services.impl;

import lombok.RequiredArgsConstructor;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesApiClient;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesServiceImpl.ExchangeRatesServiceImpl;
import org.larbcorp.GifsApiService.GifApiServiceImpl.GifApiServiceImpl;
import org.larbcorp.models.ExchangeRate;
import org.larbcorp.services.MainService;



public class MainServiceImpl implements MainService {

    ExchangeRatesServiceImpl exchangeRatesService = new ExchangeRatesServiceImpl();
    GifApiServiceImpl gifApiService = new GifApiServiceImpl();
    @Override
    public String getRate(String curName) {

        int value = exchangeRatesService.CurComparison(curName);


        return gifApiService.getGifUrl(value);

    }
}
