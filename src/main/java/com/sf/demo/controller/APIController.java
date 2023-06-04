package com.sf.demo.controller;


/*import org.springframework.security.core.Authentication;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public API endpoint";
    }

    @GetMapping("/private")
    public String privateEndpoint(/*Authentication authentication*/) {
        //String username = authentication.getName();
        return "Private API endpoint accessed : " ; //username;
    }
}
