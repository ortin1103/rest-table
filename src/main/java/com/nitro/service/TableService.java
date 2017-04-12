package com.nitro.service;


import com.nitro.config.Connections;
import com.nitro.entity.Project;
import com.nitro.entity.ResponseProjects;
import com.owlike.genson.Genson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class TableService {
    @Autowired
    Connections connections;


    public ResponseProjects getProject(){
        ResponseProjects body = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects?limit=3", HttpMethod.GET
                , connections.getConnection(), ResponseProjects.class).getBody();
        return body;
    }

    public Project getProjectUsers(String key){

            Project body = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects/{key}/permissions/users", HttpMethod.GET
                    , connections.getConnection(), Project.class, key).getBody();
        return body;
    }
    public Project getRepos(String key) {
        Project body = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects/{key}/repos", HttpMethod.GET
                , connections.getConnection(), Project.class, key).getBody();
        return body;
    }


    public Project repoUsers(String key, String repoSlug){
        Project users = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects/{key}/repos/{repoSlug}/permissions/users", HttpMethod.GET
                        , connections.getConnection(), Project.class, key,repoSlug).getBody();
        return users;
    }
    public void returnProject(){
        Genson genson=new Genson();
        genson.deserialize()

    }



}
