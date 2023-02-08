package me.klyucherov.cookbook.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class FirstController {
    @GetMapping
    public String launch() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info(Info info) {
        return info.toString();
    }




}
