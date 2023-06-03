package org.larbcorp.GifsApiService.GifApiServiceImpl;

import org.larbcorp.GifsApiService.GifApiService;

public class GifApiServiceImpl implements GifApiService {
    public String getGifUrl (int value) {
        String url;
        switch (value) {
            case -1: {
                url = "url1";
            }
            case 0: {
                url = "url2";
            }
            case 1: {
                url = "url3";
            }
            default: url = null;
        }

        return url;
    }

}
