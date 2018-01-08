package eu.printingtrackerv2.controller;

import eu.printingtrackerv2.configuration.Errors;
import eu.printingtrackerv2.model.bindingModels.RegistrationModel;
import eu.printingtrackerv2.repository.UserRepository;
import eu.printingtrackerv2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @ModelAttribute("user")
    public RegistrationModel registrationModel() {
        return new RegistrationModel();
    }

    @GetMapping("/register")
    public String getRegisterPage(@ModelAttribute RegistrationModel registrationModel){
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute RegistrationModel registrationModel, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "register";
        }

        this.userService.register(registrationModel);

        return "redirect:/";
    }

    @GetMapping("/login")
    public String getLoginPage(@RequestParam(required = false) String error, Model model){
        if(error != null){
            model.addAttribute("error", Errors.INVALID_CREDENTIALS);
        }
        return "login";
    }

    @GetMapping("/user")
    public String getUserPage(Principal principal){
        System.out.println(principal.getName());
        return "user";
    }

    @GetMapping("/admin")
    public String getAdminPage(){

        return "admin";
    }


}
