package com.nitro.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseProjects {

    List<Project> values;

    public ResponseProjects() {
    }

    public ResponseProjects(List<Project> values) {
        this.values = values;
    }

    public List<Project> getValues() {
        return values;
    }

    public void setValues(List<Project> values) {
        this.values = values;
    }
}
