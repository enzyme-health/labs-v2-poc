package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransmissionRep extends AbstractRedoxRep {

    @JsonProperty("ID")
    private Long _id;

    @JsonProperty("ID")
    public Long getID() {
        return _id;
    }

    @JsonProperty("ID")
    public void setID(Long iD) {
        _id = iD;
    }

}
