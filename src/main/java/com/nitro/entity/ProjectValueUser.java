package com.nitro.entity;


import java.util.List;

public class ProjectValueUser {
    List<User> values;

    public List<User> getValues() {
        return values;
    }

    public void setValues(List<User> values) {
        this.values = values;
    }

    public ProjectValueUser() {
    }

    public ProjectValueUser(List<User> values) {
        this.values = values;
    }
}
