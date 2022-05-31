package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcedureRep extends AbstractRedoxRep {

    @JsonProperty("Code")
    private String _code;

    @JsonProperty("Codeset")
    private String _codeset;

    @JsonProperty("Description")
    private String _description;

    @JsonProperty("Code")
    public String getCode() {
        return _code;
    }

    @JsonProperty("Code")
    public void setCode(final String code) {
        _code = code;
    }

    @JsonProperty("Codeset")
    public String getCodeset() {
        return _codeset;
    }

    @JsonProperty("Codeset")
    public void setCodeset(final String codeset) {
        _codeset = codeset;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return _description;
    }

    @JsonProperty("Description")
    public void setDescription(final String description) {
        _description = description;
    }
}
