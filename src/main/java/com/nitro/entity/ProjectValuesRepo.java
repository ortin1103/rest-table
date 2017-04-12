package com.nitro.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectValuesRepo {

    List<Repo> values;

    public ProjectValuesRepo() {
    }

    public List<Repo> getValues() {
        return values;
    }

    public void setValues(List<Repo> values) {
        this.values = values;
    }
}
