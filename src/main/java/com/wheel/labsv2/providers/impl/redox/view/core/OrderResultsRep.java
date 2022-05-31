package com.wheel.labsv2.providers.impl.redox.view.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderResultsRep extends OrderRep {

    @JsonProperty("CompletionDateTime")
    private String _completionDateTime;

    @JsonProperty("Results")
    private List<ResultRep> _results;

    @JsonProperty("ResultsStatus")
    private String _resultsStatus;

    @JsonProperty("CompletionDateTime")
    public String getCompletionDateTime() {
        return _completionDateTime;
    }

    @JsonProperty("CompletionDateTime")
    public void setCompletionDateTime(final String completionDateTime) {
        _completionDateTime = completionDateTime;
    }

    @JsonProperty("Results")
    public List<ResultRep> getResults() {
        return _results;
    }

    @JsonProperty("Results")
    public void setResults(final List<ResultRep> results) {
        _results = results;
    }

    @JsonProperty("ResultsStatus")
    public String getResultsStatus() {
        return _resultsStatus;
    }

    @JsonProperty("ResultsStatus")
    public void setResultsStatus(final String resultsStatus) {
        _resultsStatus = resultsStatus;
    }
}
