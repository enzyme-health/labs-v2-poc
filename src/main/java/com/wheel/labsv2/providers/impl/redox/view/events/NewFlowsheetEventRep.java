package com.wheel.labsv2.providers.impl.redox.view.events;

import com.wheel.labsv2.providers.impl.redox.view.core.ObservationRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewFlowsheetEventRep extends AbstractRedoxEventRep {

    @JsonProperty("Observations")
    private List<ObservationRep> _observations;

    @JsonProperty("Observations")
    public List<ObservationRep> getObservations() {
        return _observations;
    }

    @JsonProperty("Observations")
    public void setObservations(final List<ObservationRep> observations) {
        _observations = observations;
    }
}
