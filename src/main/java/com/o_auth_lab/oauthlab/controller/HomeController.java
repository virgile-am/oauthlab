package com.o_auth_lab.oauthlab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model, OAuth2AuthenticationToken authentication) {
        if (authentication != null) {
            model.addAttribute("user", authentication.getPrincipal().getAttributes());
        }
        return "home";
    }
}

