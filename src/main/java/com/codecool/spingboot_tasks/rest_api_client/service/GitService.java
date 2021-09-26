package com.codecool.spingboot_tasks.rest_api_client.service;

import com.codecool.spingboot_tasks.rest_api_client.model.GitHubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GitService {

    private final GitHubClient gitHubClient;

    @Autowired
    public GitService(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    public void getUserProperties() {
        gitHubClient.getUserProperties();
    }

    public void getStars() {
        gitHubClient.getUserStars();
    }
}
