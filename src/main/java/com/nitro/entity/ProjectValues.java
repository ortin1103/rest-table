package com.nitro.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectValues {
    User user;
    String permission;
    String slug;
    long id;
    String name;

    public ProjectValues() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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
}
