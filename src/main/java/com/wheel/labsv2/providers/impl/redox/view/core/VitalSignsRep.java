package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VitalSignsRep extends AbstractRedoxRep {

    @JsonProperty("DateTime")
    private String _dateTime;

    @JsonProperty("Observations")
    private List<ObservationRep> _observations;

    @JsonProperty("DateTime")
    public String getDateTime() {
        return _dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(final String dateTime) {
        _dateTime = dateTime;
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
