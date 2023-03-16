package org.larbcorp.OpenGifsApiService;

import feign.Param;
import feign.RequestLine;

import java.util.Map;

public interface GiphyApiClient {

    @RequestLine("GET /v1/gifs/random?api_key={apiKey}&tag={tag}&rating={rating}")
    Map<String, Object> getRandomGif(@Param("apiKey") String apiKey, @Param("tag") String tag, @Param("rating") String rating);
}
