package org.larbcorp.controllers;

import lombok.RequiredArgsConstructor;
import org.larbcorp.models.ExchangeRate;
import org.larbcorp.services.impl.MainServiceImpl;


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
