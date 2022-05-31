package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpecimenRep extends AbstractRedoxRep {

    @JsonProperty("BodySite")
    private String _bodySite;

    @JsonProperty("ID")
    private String _id;

    @JsonProperty("Source")
    private String _source;

    @JsonProperty("BodySite")
    public String getBodySite() {
        return _bodySite;
    }

    @JsonProperty("BodySite")
    public void setBodySite(final String bodySite) {
        _bodySite = bodySite;
    }

    @JsonProperty("ID")
    public String getId() {
        return _id;
    }

    @JsonProperty("ID")
    public void setId(final String id) {
        _id = id;
    }

    @JsonProperty("Source")
    public String getSource() {
        return _source;
    }

    @JsonProperty("Source")
    public void setSource(final String source) {
        _source = source;
    }
}
