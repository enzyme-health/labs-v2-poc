package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VisitRep extends AbstractRedoxRep {

    @JsonProperty("Location")
    private LocationRep _location;

    /**
     * This is in ISO-8601 format
     */
    @JsonProperty("VisitDateTime")
    private String _visitDateTime;

    /**
     * While called a "number", this is actually an ID
     */
    @JsonProperty("VisitNumber")
    private String _visitNumber;

    @JsonProperty("Location")
    public LocationRep getLocation() {
        return _location;
    }

    @JsonProperty("Location")
    public void setLocation(LocationRep location) {
        this._location = location;
    }

    @JsonProperty("StartDateTime")
    public String getVisitDateTime() {
        return _visitDateTime;
    }

    @JsonProperty("StartDateTime")
    public void setVisitDateTime(String visitDateTime) {
        this._visitDateTime = visitDateTime;
    }

    @JsonProperty("VisitNumber")
    public String getVisitNumber() {
        return _visitNumber;
    }

    @JsonProperty("VisitNumber")
    public void setVisitNumber(String visitNumber) {
        this._visitNumber = visitNumber;
    }

}
