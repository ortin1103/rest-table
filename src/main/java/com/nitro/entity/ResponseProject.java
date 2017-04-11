package com.nitro.entity;


import java.util.List;

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
