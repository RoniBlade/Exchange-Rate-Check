package org.larbcorp.services.impl;

import lombok.RequiredArgsConstructor;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesServiceImpl.ExchangeRatesServiceImpl;
import org.larbcorp.GifsApiService.GifApiServiceImpl.GifApiServiceImpl;
import org.larbcorp.services.MainService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

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
        String finalUrl = "https://giphy.com/embed/" + Arrays.stream(url.split("-"))
                .reduce((first, second) -> second)
                .orElse("") ;
        System.out.println("finalUrl " + finalUrl);
//<iframe src="https://giphy.com/embed/ZFVgQPkTmtV05vQ8Et" width="480" height="270" frameBorder="0" class="giphy-embed" allowFullScreen></iframe><p><a href="https://giphy.com/gifs/NamasteCar-design-lamborghini-huracan-ZFVgQPkTmtV05vQ8Et">via GIPHY</a></p>
        return finalUrl;

    }

    @Override
    public String getTestData(String currency) {

        String value = exchangeRatesService.CurComparison(currency);

        String url = gifApiService.getGifUrl(value);

        System.out.println("getGifUrl " + url);

        if (url.contains("rich")) {
            return "rich";
        } else if (url.contains("broke")){
            return "broke";
        }
        else return null;

    }

}
