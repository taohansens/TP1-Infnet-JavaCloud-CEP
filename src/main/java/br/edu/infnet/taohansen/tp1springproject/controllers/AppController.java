package br.edu.infnet.taohansen.tp1springproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String HomeScreen() {
        return "index";
    }

    @GetMapping(value = "/cadastro")
    public String RegisterScreen() {
        return "cadastro";
    }
}
