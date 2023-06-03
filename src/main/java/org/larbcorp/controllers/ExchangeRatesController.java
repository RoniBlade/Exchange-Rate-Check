package org.larbcorp.controllers;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;
import org.larbcorp.models.ExchangeRate;
import org.larbcorp.services.impl.MainServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;




@Controller
@RequiredArgsConstructor
public class ExchangeRatesController {

    @GetMapping("/")
    public String showCurrencyForm(Model model) {
        List<String> currencies = new ArrayList<>();
        currencies.add("EUR");
        currencies.add("RUB");
        model.addAttribute("currencies", currencies);
        return "index";
    }

//    @PostMapping("/")
//    public String showGif(@RequestParam("currency") String currencyCode, Model model) {
//        // Здесь фримаркером передается ссылка на гифку в модель
////        String gifUrl = getGifUrl(currencyCode); // Замените это соответствующим кодом для получения ссылки на гифку
//        model.addAttribute("gifUrl", gifUrl);
//        return "gif-page";
//    }

}