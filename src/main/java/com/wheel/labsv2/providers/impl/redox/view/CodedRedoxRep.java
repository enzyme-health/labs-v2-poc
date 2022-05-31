package com.wheel.labsv2.providers.impl.redox.view;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CodedRedoxRep extends AbstractRedoxRep {

    @JsonProperty("Code")
    protected String _code;

    @JsonProperty("CodeSystem")
    protected String _codeSystem;

    @JsonProperty("CodeSystemName")
    protected String _codeSystemName;

    @JsonProperty("Name")
    protected String _name;

    @JsonProperty("Code")
    public String getCode() {
        return _code;
    }

    @JsonProperty("Code")
    public void setCode(final String code) {
        _code = code;
    }

    @JsonProperty("CodeSystem")
    public String getCodeSystem() {
        return _codeSystem;
    }

    @JsonProperty("CodeSystem")
    public void setCodeSystem(final String codeSystem) {
        _codeSystem = codeSystem;
    }

    @JsonProperty("CodeSystemName")
    public String getCodeSystemName() {
        return _codeSystemName;
    }

    @JsonProperty("CodeSystemName")
    public void setCodeSystemName(final String codeSystemName) {
        _codeSystemName = codeSystemName;
    }

    @JsonProperty("Name")
    public String getName() {
        return _name;
    }

    @JsonProperty("Name")
    public void setName(final String name) {
        _name = name;
    }
}
