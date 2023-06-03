package org.larbcorp.GifsApiService;

import feign.Param;
import feign.RequestLine;

import java.util.Map;

public interface GiphyApiClient {
    /**
     * Для -1
     * @param apiKey
     * @param tag
     * @param rating
     * @return
     */
    @RequestLine("GET /v1/gifs/random?api_key={apiKey}&tag={tag}")
    Map<String, Object> getRandomGif(@Param("apiKey") String apiKey, @Param("tag") String tag);


}
