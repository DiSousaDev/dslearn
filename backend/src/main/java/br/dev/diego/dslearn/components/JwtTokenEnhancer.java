package br.dev.diego.dslearn.components;

import br.dev.diego.dslearn.entities.User;
import br.dev.diego.dslearn.repositories.UserRepository;
import br.dev.diego.dslearn.services.exceptions.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenEnhancer implements TokenEnhancer {

    @Autowired
    private UserRepository userRepository;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

        User user = userRepository.findByEmail(authentication.getName()).orElseThrow(() -> new DataNotFoundException("User not found."));
        Map<String, Object> map = new HashMap<>();
        map.put("name", user.getName());
        map.put("email", user.getEmail());
        map.put("userId", user.getId());

        DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) accessToken;
        token.setAdditionalInformation(map);
        return accessToken;
    }

}
