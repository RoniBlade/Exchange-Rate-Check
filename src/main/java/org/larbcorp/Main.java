package org.larbcorp;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import org.larbcorp.OpenExchangeRatesApiService.ExchangeRate;
import org.larbcorp.OpenExchangeRatesApiService.OpenExchangeRatesApi;
import org.larbcorp.OpenGifsApiService.GiphyApiClient;

import java.util.Map;


public class Main {
    public static void main(String[] args) {

        OpenExchangeRatesApi openExchangeRatesApi = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(OpenExchangeRatesApi.class, "https://openexchangerates.org");

        ExchangeRate exchangeRate = openExchangeRatesApi.getExchangeRate("3228872d4dd44f5586fcf046accad6c4", "EUR", "2022-02-12");
        ExchangeRate exchangeRateYesterday = openExchangeRatesApi.getExchangeRate("3228872d4dd44f5586fcf046accad6c4", "EUR", "2022-02-11");

        System.out.println(exchangeRate.getRates().values().stream().findFirst().orElseThrow());

        GiphyApiClient giphyApiClient = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(GiphyApiClient.class, "https://api.giphy.com");

        String apiKey = "e2PCuK4d4cSCJfza61HLb3B1TMjawCvH";
        String tag = "";
        String rating = "g";

        Map<String, Object> response = giphyApiClient.getRandomGif(apiKey, tag, rating);
        @SuppressWarnings("unchecked")
        Map<String, Object> data = (Map<String, Object>) response.get("data");

        System.out.println(data);

        System.out.println("Random GIF URL: " + data.get("url"));
    }
}



