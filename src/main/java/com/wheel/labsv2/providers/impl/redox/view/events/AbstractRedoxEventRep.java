package com.wheel.labsv2.providers.impl.redox.view.events;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.wheel.labsv2.providers.impl.redox.view.core.MetaRep;
import com.wheel.labsv2.providers.impl.redox.view.core.PatientRep;
import com.wheel.labsv2.providers.impl.redox.view.core.VisitRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractRedoxEventRep extends AbstractRedoxRep {

    @JsonProperty("Meta")
    private MetaRep _meta;

    @JsonProperty("Patient")
    private PatientRep _patient;

    @JsonProperty("Visit")
    private VisitRep _visit;

    @JsonProperty("Meta")
    public MetaRep getMeta() {
        return _meta;
    }

    @JsonProperty("Meta")
    public void setMeta(final MetaRep meta) {
        _meta = meta;
    }

    @JsonProperty("Patient")
    public PatientRep getPatient() {
        return _patient;
    }

    @JsonProperty("Patient")
    public void setPatient(final PatientRep patient) {
        _patient = patient;
    }

    @JsonProperty("Visit")
    public VisitRep getVisit() {
        return _visit;
    }

    @JsonProperty("Visit")
    public void setVisit(final VisitRep visit) {
        _visit = visit;
    }
}
