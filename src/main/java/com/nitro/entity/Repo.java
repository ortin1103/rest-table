package com.nitro.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class Repo {
    String slug;
    long id;
    String name;
    List<User> users;

    public Repo() {
    }

    public Repo(String slug, long id, String name, List<User> users) {
        this.slug = slug;
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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
}
