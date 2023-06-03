package org.larbcorp.controllers;

import lombok.RequiredArgsConstructor;
import org.larbcorp.models.ExchangeRate;
import org.larbcorp.services.MainService;
import org.larbcorp.services.impl.MainServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ExchangeRatesController {


    private final MainService mainService;

    @GetMapping("/")
    public String showCurrencyForm(Model model) {
//        List<String> currencies = new ArrayList<>();
//        currencies.add("EUR");
//        model.addAttribute("currencies", currencies);

        model.addAttribute("gifUrl", mainService.getUrl("EUR"));

        <iframe src="https://giphy.com/embed/WISTaCYz1ZmiBs1iKm" width="480" height="480" frameBorder="0" class="giphy-embed" allowFullScreen></iframe><p><a href="https://giphy.com/gifs/Biteable-money-job-rich-WISTaCYz1ZmiBs1iKm">via GIPHY</a></p>


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
