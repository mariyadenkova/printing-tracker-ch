package eu.printingtrackerv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SinglePageController {
    @GetMapping("/customers")
    public String getSinglePage(){
        return "customers";
    }

    @GetMapping("/customers#")
    public String getCustomerPage(){
        return "customers";
    }
}
