package com.nitro.entity;


import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Repo {
    String slug;
    long id;
    String name;
    List<User> values;

    public Repo() {
    }

    public Repo(String slug, long id, String name, List<User> values) {
        this.slug = slug;
        this.id = id;
        this.name = name;
        this.values = values;
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

    public List<User> getValues() {
        return values;
    }

    public void setValues(List<User> values) {
        this.values = values;
    }
}
