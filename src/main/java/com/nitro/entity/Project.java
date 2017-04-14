package com.nitro.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {
    String key;
    long id;
    String name;
    List<User> users;
    List<Repo> repos;
    List<String> equailsProjectUsers;



    public Project() {
    }

    public Project(String key, long id, String name, List<User> users, List<Repo> repos) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.users = users;
        this.repos = repos;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Repo> getRepos() {
        return repos;
    }

    public void setRepos(List<Repo> repos) {
        this.repos = repos;
    }
    public List<String> getEquailsProjectUsers() {
        return equailsProjectUsers;
    }

    public void setEquailsProjectUsers(List<String> equailsProjectUsers) {
        this.equailsProjectUsers = equailsProjectUsers;
    }
}
