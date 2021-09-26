package com.codecool.spingboot_tasks.rest_api_client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRepos {

    @JsonProperty("stargazers_count")
    private int stars;
}
