package com.example.testoauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)
            throws Exception
    {
        return http
                .oauth2Login()
                .successHandler(new AuthenticationHandler())
                .and()

                // For Admin only
                .authorizeRequests()
                .antMatchers("/admin")
                .authenticated()
                .and()

                // For the public
                .authorizeRequests()
                .antMatchers("/")
                .permitAll()
                .and()
                .build();
    }

}