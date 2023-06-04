package com.sf.demo.config;

/*
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

 */

//@Configuration
public class OAuth2Config {
/*
    @Value("${spring.security.oauth2.client.registration.google.client-id}") private String clientId;

    @Value("${spring.security.oauth2.client.registration.google.client-secret}") private String clientSecret;

    @Value("${spring.security.oauth2.client.provider.google.authorization-uri}") private String authorizationUri;

    @Value("${spring.security.oauth2.client.provider.google.token-uri}") private String tokenUri;

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        return new InMemoryClientRegistrationRepository(clientRegistration());
    }

    private ClientRegistration clientRegistration() {
        return ClientRegistration.withRegistrationId("google").clientId(clientId).clientSecret(clientSecret)
                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE).redirectUriTemplate(redirectUri())
                .authorizationUri(authorizationUri).tokenUri(tokenUri).build();
    }

    private String redirectUri() {
        ServletUriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentContextPath();
        builder.path("/login/oauth2/code/{registrationId}");
        return builder.buildAndExpand("google").toUriString();
    }
 */
}
