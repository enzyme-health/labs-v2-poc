package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientRep extends AbstractRedoxRep {

    @JsonProperty("Demographics")
    private DemographicsRep _demographics;

    @JsonProperty("Identifiers")
    private List<IdentifierRep> _identifiers = null;

    @JsonProperty("Demographics")
    public DemographicsRep getDemographics() {
        return _demographics;
    }

    @JsonProperty("Demographics")
    public void setDemographics(DemographicsRep demographics) {
        _demographics = demographics;
    }

    @JsonProperty("Identifiers")
    public List<IdentifierRep> getIdentifiers() {
        return _identifiers;
    }

    @JsonProperty("Identifiers")
    public void setIdentifiers(List<IdentifierRep> identifiers) {
        _identifiers = identifiers;
    }
}
