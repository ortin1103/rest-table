package com.nitro.entity;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class Project {
    String key;
    long id;
    String name;
    List<ValuesProject> values;



}
