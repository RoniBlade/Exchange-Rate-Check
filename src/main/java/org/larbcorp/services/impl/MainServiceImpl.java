package org.larbcorp.services.impl;

import lombok.RequiredArgsConstructor;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesServiceImpl.ExchangeRatesServiceImpl;
import org.larbcorp.GifsApiService.GifApiServiceImpl.GifApiServiceImpl;
import org.larbcorp.services.MainService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MainServiceImpl implements MainService {

    ExchangeRatesServiceImpl exchangeRatesService = new ExchangeRatesServiceImpl();


    GifApiServiceImpl gifApiService = new GifApiServiceImpl();
    @Override
    public String getUrl(String currency) {

        String value = exchangeRatesService.CurComparison(currency);

        String url = gifApiService.getGifUrl(value);

        System.out.println("getGifUrl " + url);

        return url;

    }




}
