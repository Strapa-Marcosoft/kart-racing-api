package com.marcosoft.kartracingapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import java.util.List;

@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final List<String> ALLOWED_ORIGINS = List.of("*");
    private final String ALLOWED_METHODS = "*";

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .cors().configurationSource(request -> {
                    var cors = new CorsConfiguration();
                    cors.setAllowedOriginPatterns(ALLOWED_ORIGINS);
                    cors.addAllowedMethod(ALLOWED_METHODS);
                    cors.addAllowedHeader("*");
                    return cors;
                }).and().csrf().disable();
    }
}
