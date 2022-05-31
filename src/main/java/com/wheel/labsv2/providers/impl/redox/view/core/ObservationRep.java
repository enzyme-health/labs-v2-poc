package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.CodedRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObservationRep extends CodedRedoxRep {

    @JsonProperty("AbnormalFlag")
    private String _abnormalFlag;

    @JsonProperty("DateTime")
    private String _dateTime;

    @JsonProperty("Description")
    private String _description;

    @JsonProperty("Units")
    private String _units;

    @JsonProperty("Value")
    private String _value;

    @JsonProperty("ValueType")
    private String _valueType;

    @JsonProperty("AbnormalFlag")
    public String getAbnormalFlag() {
        return _abnormalFlag;
    }

    @JsonProperty("AbnormalFlag")
    public void setAbnormalFlag(final String abnormalFlag) {
        _abnormalFlag = abnormalFlag;
    }

    @JsonProperty("DateTime")
    public String getDateTime() {
        return _dateTime;
    }

    @JsonProperty("DateTime")
    public void setDateTime(final String dateTime) {
        _dateTime = dateTime;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return _description;
    }

    @JsonProperty("Description")
    public void setDescription(final String description) {
        _description = description;
    }

    @JsonProperty("Units")
    public String getUnits() {
        return _units;
    }

    @JsonProperty("Units")
    public void setUnits(final String units) {
        _units = units;
    }

    @JsonProperty("Value")
    public String getValue() {
        return _value;
    }

    @JsonProperty("Value")
    public void setValue(final String value) {
        _value = value;
    }

    @JsonProperty("ValueType")
    public String getValueType() {
        return _valueType;
    }

    @JsonProperty("ValueType")
    public void setValueType(final String valueType) {
        _valueType = valueType;
    }
}
