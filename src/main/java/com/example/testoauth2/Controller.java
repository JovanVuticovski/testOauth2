package com.example.testoauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {


    @GetMapping("admin")
    public String admin() {
        return ("<h1> Hi you are admin of this app</h1>");
    }


    @GetMapping("/")
    public String viewPublic() {
        return ("<h1> Welcome to my oauth2 app</h1>");
    }



}

















