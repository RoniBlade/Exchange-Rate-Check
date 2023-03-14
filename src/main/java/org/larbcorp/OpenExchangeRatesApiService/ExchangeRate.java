package org.larbcorp.OpenExchangeRatesApiService;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Data
public class ExchangeRate {
    private String disclaimer;
    private String license;
    private long timestamp;
    private String base;
    private Map<String, Double> rates;

}