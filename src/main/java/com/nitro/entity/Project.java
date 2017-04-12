package com.nitro.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {
    String key;
    long id;
    String name;
    List<ValuesProject> values;

    public Project() {
    }

    public Project(String key, long id, String name, List<ValuesProject> values) {
        this.key = key;
        this.id = id;
        this.name = name;
        this.values = values;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public List<ValuesProject> getValues() {
        return values;
    }

    public void setValues(List<ValuesProject> values) {
        this.values = values;
    }
}
