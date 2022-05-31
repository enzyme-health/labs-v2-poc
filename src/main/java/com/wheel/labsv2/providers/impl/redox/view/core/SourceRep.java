package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceRep extends AbstractRedoxRep {

    @JsonProperty("ID")
    private String _id;

    @JsonProperty("Name")
    private String _name;

    @JsonProperty("ID")
    public String getID() {
        return _id;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        _id = iD;
    }

    @JsonProperty("Name")
    public String getName() {
        return _name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        _name = name;
    }
}
