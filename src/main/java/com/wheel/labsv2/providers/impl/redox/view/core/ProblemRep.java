package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.CodedRedoxRep;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProblemRep extends CodedRedoxRep {

    @JsonProperty("AltCodes")
    private List<CodedRedoxRep> _altCodes;
    @JsonProperty("Category")
    private CodedRedoxRep _category;
    @JsonProperty("Comment")
    private String _comment;
    @JsonProperty("EndDate")
    private String _endDate;
    @JsonProperty("HealthStatus")
    private CodedRedoxRep _healthStatus;
    @JsonProperty("StartDate")
    private String _startDate;
    @JsonProperty("Status")
    private CodedRedoxRep _status;

    @JsonProperty("AltCodes")
    public List<CodedRedoxRep> getAltCodes() {
        return _altCodes;
    }

    @JsonProperty("AltCodes")
    public void setAltCodes(final List<CodedRedoxRep> altCodes) {
        _altCodes = altCodes;
    }

    @JsonProperty("Category")
    public CodedRedoxRep getCategory() {
        return _category;
    }

    @JsonProperty("Category")
    public void setCategory(final CodedRedoxRep category) {
        _category = category;
    }

    @JsonProperty("Comment")
    public String getComment() {
        return _comment;
    }

    @JsonProperty("Comment")
    public void setComment(final String comment) {
        _comment = comment;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return _endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(final String endDate) {
        _endDate = endDate;
    }

    @JsonProperty("HealthStatus")
    public CodedRedoxRep getHealthStatus() {
        return _healthStatus;
    }

    @JsonProperty("HealthStatus")
    public void setHealthStatus(final CodedRedoxRep healthStatus) {
        _healthStatus = healthStatus;
    }

    @JsonProperty("StartDate")
    public String getStartDate() {
        return _startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(final String startDate) {
        _startDate = startDate;
    }

    @JsonProperty("Status")
    public CodedRedoxRep getStatus() {
        return _status;
    }

    @JsonProperty("Status")
    public void setStatus(final CodedRedoxRep status) {
        _status = status;
    }
}
