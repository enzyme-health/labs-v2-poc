package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReferenceRangeRep extends AbstractRedoxRep {

    @JsonProperty("High")
    private Number _high;

    @JsonProperty("Low")
    private Number _low;

    @JsonProperty("Text")
    private String _text;

    @JsonProperty("High")
    public Number getHigh() {
        return _high;
    }

    @JsonProperty("High")
    public void setHigh(final Number high) {
        _high = high;
    }

    @JsonProperty("Low")
    public Number getLow() {
        return _low;
    }

    @JsonProperty("Low")
    public void setLow(final Number low) {
        _low = low;
    }

    @JsonProperty("Text")
    public String getText() {
        return _text;
    }

    @JsonProperty("Text")
    public void setText(final String text) {
        _text = text;
    }
}
