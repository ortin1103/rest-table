package com.nitro.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    UserDetail user;
    String permission;
    long id;

    public User() {
    }

    public User(UserDetail user, String permission, long id) {
        this.user = user;
        this.permission = permission;
        this.id = id;
    }

    public UserDetail getUser() {
        return user;
    }

    public void setUser(UserDetail user) {
        this.user = user;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
