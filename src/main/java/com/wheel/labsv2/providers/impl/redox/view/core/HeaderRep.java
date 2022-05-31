package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HeaderRep extends AbstractRedoxRep {

    @JsonProperty("Patient")
    private PatientRep _patient;

    @JsonProperty("Patient")
    public PatientRep getPatient() {
        return _patient;
    }

    @JsonProperty("Patient")
    public void setPatient(final PatientRep patient) {
        _patient = patient;
    }

}
