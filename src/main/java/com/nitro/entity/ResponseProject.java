package com.nitro.entity;


import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ResponseProject {
    List<Project> values;

    public List<Project> getValues() {
        return values;
    }

    public void setValues(List<Project> values) {
        this.values = values;
    }

    public ResponseProject() {
    }

    public ResponseProject(List<Project> values) {
        this.values = values;
    }
}
