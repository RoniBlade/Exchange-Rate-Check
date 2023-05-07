package org.larbcorp.controllers;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;
import org.larbcorp.services.impl.MainServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ExchangeRatesController {

    private final MainServiceImpl usersService;

    @GetMapping("/")
    public String getUsersPage(Model model) {
//        model.addAttribute("users", usersService.getAllRates());
        return "Users/users_page";
    }

}
