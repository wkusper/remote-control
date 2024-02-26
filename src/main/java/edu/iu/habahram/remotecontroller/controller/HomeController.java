package edu.iu.habahram.remotecontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {



    @GetMapping("/")
    public String greetings() {
        return "Welcome to the remote controller system!";
    }
}
