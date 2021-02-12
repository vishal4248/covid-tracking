package com.virus.covidtracking.controllers;

import com.virus.covidtracking.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("locationStats",coronaVirusDataService.getAllStats());
        return "home";
    }
}
