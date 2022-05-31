package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemographicsRep extends AbstractRedoxRep {

    @JsonProperty("DOB")
    private String _dob;
    @JsonProperty("Ethnicity")
    private String _ethnicity;
    @JsonProperty("FirstName")
    private String _firstName;
    @JsonProperty("LastName")
    private String _lastName;
    @JsonProperty("MaritalStatus")
    private String _maritalStatus;
    @JsonProperty("MiddleName")
    private String _middleName;
    @JsonProperty("Race")
    private String _race;
    @JsonProperty("Sex")
    private String _sex;

    @JsonProperty("DOB")
    public String getDOB() {
        return _dob;
    }

    @JsonProperty("DOB")
    public void setDOB(String dOB) {
        _dob = dOB;
    }

    @JsonProperty("Ethnicity")
    public String getEthnicity() {
        return _ethnicity;
    }

    @JsonProperty("Ethnicity")
    public void setEthnicity(final String ethnicity) {
        _ethnicity = ethnicity;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return _firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return _lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    @JsonProperty("MaritalStatus")
    public String getMaritalStatus() {
        return _maritalStatus;
    }

    @JsonProperty("MaritalStatus")
    public void setMaritalStatus(final String maritalStatus) {
        _maritalStatus = maritalStatus;
    }

    @JsonProperty("MiddleName")
    public String getMiddleName() {
        return _middleName;
    }

    @JsonProperty("MiddleName")
    public void setMiddleName(String middleName) {
        _middleName = middleName;
    }

    @JsonProperty("Race")
    public String getRace() {
        return _race;
    }

    @JsonProperty("Race")
    public void setRace(String race) {
        _race = race;
    }

    @JsonProperty("Sex")
    public String getSex() {
        return _sex;
    }

    @JsonProperty("Sex")
    public void setSex(String sex) {
        _sex = sex;
    }
}
