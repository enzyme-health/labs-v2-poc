package com.wheel.labsv2.providers.impl.redox.view.events;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.wheel.labsv2.providers.impl.redox.view.core.ClinicalSummaryResultRep;
import com.wheel.labsv2.providers.impl.redox.view.core.HeaderRep;
import com.wheel.labsv2.providers.impl.redox.view.core.MetaRep;
import com.wheel.labsv2.providers.impl.redox.view.core.ProblemRep;
import com.wheel.labsv2.providers.impl.redox.view.core.VitalSignsRep;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ClinicalSummaryEventRep extends AbstractRedoxRep {

    @JsonProperty("Header")
    private HeaderRep _header;
    @JsonProperty("Meta")
    private MetaRep _meta;
    @JsonProperty("Problems")
    private List<ProblemRep> _problems;
    @JsonProperty("Results")
    private List<ClinicalSummaryResultRep> _results;
    @JsonProperty("VitalSigns")
    private List<VitalSignsRep> _vitalSigns;

    @JsonProperty("Header")
    public HeaderRep getHeader() {
        return _header;
    }

    @JsonProperty("Header")
    public void setHeader(final HeaderRep header) {
        _header = header;
    }

    @JsonProperty("Meta")
    public MetaRep getMeta() {
        return _meta;
    }

    @JsonProperty("Meta")
    public void setMeta(final MetaRep meta) {
        _meta = meta;
    }

    @JsonProperty("Problems")
    public List<ProblemRep> getProblems() {
        return _problems;
    }

    @JsonProperty("Problems")
    public void setProblems(final List<ProblemRep> problems) {
        _problems = problems;
    }

    @JsonProperty("Results")
    public List<ClinicalSummaryResultRep> getResults() {
        return _results;
    }

    @JsonProperty("Results")
    public void setResults(final List<ClinicalSummaryResultRep> results) {
        _results = results;
    }

    @JsonProperty("VitalSigns")
    public List<VitalSignsRep> getVitalSigns() {
        return _vitalSigns;
    }

    @JsonProperty("VitalSigns")
    public void setVitalSigns(final List<VitalSignsRep> vitalSigns) {
        _vitalSigns = vitalSigns;
    }
}
