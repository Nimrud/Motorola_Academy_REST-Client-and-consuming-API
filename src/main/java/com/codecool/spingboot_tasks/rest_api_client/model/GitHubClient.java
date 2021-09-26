package com.codecool.spingboot_tasks.rest_api_client.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class GitHubClient {

    @Value("${git.address}")
    private String url;

    public void getUserProperties() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> response = template.getForEntity(url + "marwin1991", String.class);
        log.info(response.getStatusCode().toString());
        log.info(response.getBody());
    }
}
