package com.nitro.service;


import com.nitro.config.Connections;
import com.nitro.entity.Project;
import com.nitro.entity.ResponseProject;
import com.owlike.genson.Genson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TableService {
    @Autowired
    Connections connections;
    @Autowired
    ResponseProject responseProject;


    public ResponseProject getProject(){
        ResponseProject body = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects?limit=3", HttpMethod.GET
                , connections.getConnection(), ResponseProject.class).getBody();
        return body;
    }

    public List<Project> getProjectUsers(){
        List<Project> values = new ArrayList<>();
        List<Project> projects = getProject().getValues();
        for (Project project: projects
             ) {
            String key = project.getKey();

            ResponseEntity<Project> exchange = connections.getRestTemplate().exchange("http://stash.riversoft.biz:7990/projects/{key}/permissions/users", HttpMethod.GET
                    , connections.getConnection(), Project.class, key);

            Genson genson = new Genson();
            genson.deserialize(exchange.getBody())



        }
        return values;


    }
}
