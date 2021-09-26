package com.codecool.spingboot_tasks.rest_api_client.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Slf4j
@Component
public class GitHubClient {

    @Value("${git.address}")
    private String url;

    public void getUserProperties() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<User> response = template.getForEntity(url + "marwin1991", User.class);
        log.info(response.getStatusCode().toString());
        log.info(response.getBody().toString());

        //Map<String, String> map = new HashMap<>(response);
    }

    public void getUserStars(){
        RestTemplate template = new RestTemplate();
        ResponseEntity<UserRepos[]> response = template.getForEntity(url + "marwin1991/repos?per_page=100", UserRepos[].class);
        log.info(response.getStatusCode().toString());
        log.info(response.getBody().toString());

        List<UserRepos> list = Arrays.asList(response.getBody());
        int stars = 0;
        for (UserRepos ur : list) {
            stars += ur.getStars();
        }
        log.info(String.valueOf(stars));
    }
}
