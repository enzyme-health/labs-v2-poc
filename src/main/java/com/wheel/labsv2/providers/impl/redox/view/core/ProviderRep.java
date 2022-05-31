package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProviderRep extends AbstractRedoxRep {

    @JsonProperty("FirstName")
    private String _firstName;

    @JsonProperty("ID")
    private String _id;

    @JsonProperty("IDType")
    private String _idType;

    @JsonProperty("LastName")
    private String _lastName;

    @JsonProperty("NPI")
    private String _npi;

    @JsonProperty("FirstName")
    public String getFirstName() {
        return _firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(final String firstName) {
        _firstName = firstName;
    }

    @JsonProperty("ID")
    public String getId() {
        return _id;
    }

    @JsonProperty("ID")
    public void setId(final String id) {
        _id = id;
    }

    @JsonProperty("IDType")
    public String getIdType() {
        return _idType;
    }

    @JsonProperty("IDType")
    public void setIdType(final String idType) {
        _idType = idType;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return _lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(final String lastName) {
        _lastName = lastName;
    }

    @JsonProperty("NPI")
    public String getNpi() {
        return _npi;
    }

    @JsonProperty("NPI")
    public void setNpi(final String npi) {
        _npi = npi;
    }
}
