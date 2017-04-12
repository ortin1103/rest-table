package com.nitro.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ValuesProject {

    List<User> user;
    List<Repo> repo;

    public ValuesProject() {
    }

    public ValuesProject(List<User> user, List<Repo> repo) {
        this.user = user;
        this.repo = repo;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Repo> getRepo() {
        return repo;
    }

    public void setRepo(List<Repo> repo) {
        this.repo = repo;
    }
}
