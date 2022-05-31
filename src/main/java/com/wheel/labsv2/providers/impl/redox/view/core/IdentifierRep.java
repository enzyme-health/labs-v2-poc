package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdentifierRep extends AbstractRedoxRep {

    @JsonProperty("ID")
    private String _id;

    @JsonProperty("IDType")
    private String _idType;

    @JsonProperty("ID")
    public String getID() {
        return _id;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        _id = iD;
    }

    @JsonProperty("IDType")
    public String getIDType() {
        return _idType;
    }

    @JsonProperty("IDType")
    public void setIDType(String iDType) {
        _idType = iDType;
    }
}
