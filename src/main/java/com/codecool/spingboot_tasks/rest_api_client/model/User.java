package com.codecool.spingboot_tasks.rest_api_client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
    private String name;
    private String location;
    private Integer publicRepos;

    @JsonProperty("stargazers_count")
    private int stars;
}
