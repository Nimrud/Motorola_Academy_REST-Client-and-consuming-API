package com.codecool.spingboot_tasks.rest_api_client.model;

import lombok.Data;

@Data
public class User {
    private String login;
    private Integer id;
    private String nodeId;
    private String avatarUrl;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private Boolean siteAdmin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private Object email;
    private Boolean hireable;
    private String bio;
    private Object twitterUsername;
    private Integer publicRepos;
    private Integer publicGists;
    private Integer followers;
    private Integer following;
    private String createdAt;
    private String updatedAt;
}
