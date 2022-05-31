package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationRep extends AbstractRedoxRep {

    @JsonProperty("Department")
    private String _department;

    @JsonProperty("Facility")
    private String _facility;

    @JsonProperty("Type")
    private String _type;

    @JsonProperty("Department")
    public String getDepartment() {
        return _department;
    }

    @JsonProperty("Department")
    public void setDepartment(String department) {
        this._department = department;
    }

    @JsonProperty("Facility")
    public String getFacility() {
        return _facility;
    }

    @JsonProperty("Facility")
    public void setFacility(String facility) {
        this._facility = facility;
    }

    @JsonProperty("Type")
    public String getType() {
        return _type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this._type = type;
    }
}
