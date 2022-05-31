package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ClinicalSummaryResultRep extends AbstractRedoxRep {

    @JsonProperty("Code")
    private String _code;

    @JsonProperty("Name")
    private String _name;

    @JsonProperty("Observations")
    private List<ObservationRep> _observations;

    @JsonProperty("Code")
    public String getCode() {
        return _code;
    }

    @JsonProperty("Code")
    public void setCode(final String code) {
        _code = code;
    }

    @JsonProperty("Name")
    public String getName() {
        return _name;
    }

    @JsonProperty("Name")
    public void setName(final String name) {
        _name = name;
    }

    @JsonProperty("Observations")
    public List<ObservationRep> getObservations() {
        return _observations;
    }

    @JsonProperty("Observations")
    public void setObservations(final List<ObservationRep> observations) {
        _observations = observations;
    }
}
