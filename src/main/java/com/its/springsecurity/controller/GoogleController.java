//package com.its.springsecurity.controller;
//
//import com.google.api.client.auth.oauth2.TokenResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.oauth2.client.OAuth2RestOperations;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//public class GoogleController {
//
//
//
//
//    private final OAuth2RestOperations restTemplate;
//
//    @Value("${spring.security.oauth2.client.registration.google.client-id}")
//    private String clientId;
//
//    @Value("${spring.security.oauth2.client.registration.google.client-secret}")
//    private String clientSecret;
//
//    @Value("${spring.security.oauth2.client.registration.google.redirect-uri}")
//    private String redirectUri;
//
//
//    public String callback(@RequestParam("code") String code) {
//        // Use the code to fetch an access token
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        params.add("code", code);
//        params.add("client_id", clientId);
//        params.add("client_secret", clientSecret);
//        params.add("redirect_uri", redirectUri);
//        params.add("grant_type", "authorization_code");
//        TokenResponse tokenResponse = restTemplate.postForObject("https://accounts.google.com/o/oauth2/token", params, TokenResponse.class);
//        // Use the access token to access the user's Google Drive files
//        // ...
//        return "redirect:/";
//    }
//}
