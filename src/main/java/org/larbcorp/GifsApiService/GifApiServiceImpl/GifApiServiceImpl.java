package org.larbcorp.GifsApiService.GifApiServiceImpl;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import org.larbcorp.GifsApiService.GifApiService;
import org.larbcorp.GifsApiService.GiphyApiClient;

import java.util.Map;

public class GifApiServiceImpl implements GifApiService {
    GiphyApiClient giphyApiClient = Feign.builder()
            .decoder(new JacksonDecoder())
            .target(GiphyApiClient.class, "https://api.giphy.com");

    String apiKey = "e2PCuK4d4cSCJfza61HLb3B1TMjawCvH";
    private String tag;

    public String getGifUrl (String value) {
        String url;
        tag = value;
        Map<String, Object> response = giphyApiClient.getRandomGif(apiKey, tag);
        @SuppressWarnings("unchecked")
        Map<String, Object> data = (Map<String, Object>) response.get("data");
        return data.get("url").toString();
    }

}
