package com.amrut.prabhu.oauth2.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.security.Principal;

@CrossOrigin(origins = "", allowedHeaders = "")
@RestController

public class Controller {

    @GetMapping("/")
    public String index(Principal principal) {
        return principal.getName();
    }
}