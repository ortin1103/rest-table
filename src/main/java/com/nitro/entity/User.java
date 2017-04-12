package com.nitro.entity;


import org.springframework.stereotype.Component;

@Component
public class User {
    String name;
    String displayName;
    String emailAddress;
    String permission;
    long id;

    public User() {
    }

    public User(String name, String displayName, String emailAddress, String permission, long id) {
        this.name = name;
        this.displayName = displayName;
        this.emailAddress = emailAddress;
        this.permission = permission;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
