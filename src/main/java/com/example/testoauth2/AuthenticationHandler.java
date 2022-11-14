package com.example.testoauth2;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

// class navigates to root route when user authenticates
public class AuthenticationHandler
        extends SimpleUrlAuthenticationSuccessHandler
        implements AuthenticationSuccessHandler
{
    public AuthenticationHandler() {
        super();

        // resets previous route
        setUseReferer(false);
    }
}