package com.nitro.service;


import com.nitro.config.Connections;
import com.nitro.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TableService {
    @Autowired
    Connections connections;


    public ResponseProjects getProject() {

        ResponseProjects body = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects?limit=5", HttpMethod.GET
                , connections.getConnection(), ResponseProjects.class).getBody();

        return body;
    }
    public List<Repo> getRepo(String key){
        ProjectValuesRepo body = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects/{key}/repos"
                , HttpMethod.GET, connections.getConnection(), ProjectValuesRepo.class, key).getBody();
        List<Repo> values = body.getValues();
        return values;
    }

    public List<User> usersProject(String key){
        ProjectValueUser body = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects/{key}/permissions/users"
                , HttpMethod.GET, connections.getConnection(), ProjectValueUser.class, key).getBody();
        List<User> values = body.getValues();
        return values;

    }

    public List<User> getRepoUsers(String key, String slug){
        RepoValuesUser body = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects/{key}/repos/{slug}/permissions/users"
                , HttpMethod.GET, connections.getConnection(), RepoValuesUser.class, key, slug).getBody();
        List<User> values = body.getValues();
        return values;
    }
    public List<Project> getProjects(){

        List<Project> projects = new ArrayList<>();

        List<Project> values = getProject().getValues();

        for (Project project:values){
            String key = project.getKey();
            project.setUsers(usersProject(key));
            List<Repo> reposUsers = getRepo(key);
            List<Repo> repos = getRepo(key);

            for (Repo repo:repos){
                String slug = repo.getSlug();
                List<User> repoUser = getRepoUsers(key, slug);
                repo.setValues(repoUser);
                reposUsers.add(repo);
            }
            project.setRepos(reposUsers);

            projects.add(project);

        }
        return projects;
    }


}
