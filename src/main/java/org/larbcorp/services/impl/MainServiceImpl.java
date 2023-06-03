package org.larbcorp.services.impl;

import lombok.RequiredArgsConstructor;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesApiClient;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesServiceImpl.ExchangeRatesServiceImpl;
<<<<<<< HEAD
=======
import org.larbcorp.GifsApiService.GifApiServiceImpl.GifApiServiceImpl;
>>>>>>> c81b9e1334f64f8dc27099160d8de745db1e93db
import org.larbcorp.models.ExchangeRate;
import org.larbcorp.services.MainService;



public class MainServiceImpl implements MainService {

    ExchangeRatesServiceImpl exchangeRatesService = new ExchangeRatesServiceImpl();
<<<<<<< HEAD
=======
    GifApiServiceImpl gifApiService = new GifApiServiceImpl();
>>>>>>> c81b9e1334f64f8dc27099160d8de745db1e93db
    @Override
    public String getRate(String curName) {

        int value = exchangeRatesService.CurComparison(curName);

<<<<<<< HEAD
        return null;
//        return LevMethodName(value);
=======

        return gifApiService.getGifUrl(value);
>>>>>>> c81b9e1334f64f8dc27099160d8de745db1e93db

    }
}
