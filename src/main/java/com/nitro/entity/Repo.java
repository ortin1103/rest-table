package com.nitro.entity;


import java.util.List;

public class Repo {
    String slug;
    long id;
    String name;
    List<User> values;

    public Repo(String slug, long id, String name) {
        this.slug = slug;
        this.id = id;
        this.name = name;
    }

    public Repo() {

    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
