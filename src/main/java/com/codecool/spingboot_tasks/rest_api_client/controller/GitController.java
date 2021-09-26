package com.codecool.spingboot_tasks.rest_api_client.controller;

import com.codecool.spingboot_tasks.rest_api_client.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GitController {

    private final GitService gitService;

    @Autowired
    public GitController(GitService gitService) {
        this.gitService = gitService;
    }

    @GetMapping("/data")
    public String data() {
        gitService.getUserProperties();
        return "OK";
    }
}
