package eu.printingtrackerv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessController {

    @GetMapping("/unauthorized")
    public String getUnauthorizedPage(){

        return "Sorry, you don't have access to this page!";
    }
}
