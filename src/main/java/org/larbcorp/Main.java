package org.larbcorp;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesService;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesServiceImpl.ExchangeRatesServiceImpl;
import org.larbcorp.models.ExchangeRate;
import org.larbcorp.ExchangeRatesApiService.ExchangeRatesApiClient;
import org.larbcorp.GifsApiService.GiphyApiClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Map;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

//        ExchangeRatesServiceImpl exchangeRatesService = new ExchangeRatesServiceImpl();

//        System.out.println(exchangeRatesService.CurComparison("USD"));

//        System.out.println(exchangeRate.getRates().values().stream().findFirst().orElseThrow());

//        GiphyApiClient giphyApiClient = Feign.builder()
//                .decoder(new JacksonDecoder())
//                .target(GiphyApiClient.class, "https://api.giphy.com");
//
//        String apiKey = "e2PCuK4d4cSCJfza61HLb3B1TMjawCvH";
//        String tag = "";
//        String rating = "g";
//
//        Map<String, Object> response = giphyApiClient.getRandomGif(apiKey, tag, rating);
//        @SuppressWarnings("unchecked")
//        Map<String, Object> data = (Map<String, Object>) response.get("data");
//
//        System.out.println(response);
//
//        System.out.println("Random GIF URL: " + data.get("url"));

//        LocalDate currentDate = LocalDate.now();
//        LocalDate yesterdayDate = currentDate.minusDays(1);
//        System.out.println(yesterdayDate.toString());


    }
}



