package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultRep extends AbstractRedoxRep {

    @JsonProperty("AbnormalFlag")
    private String _abnormalFlag;

    @JsonProperty("Code")
    private String _code;

    @JsonProperty("Codeset")
    private String _codeset;

    @JsonProperty("CompletionDateTime")
    private String _completionDateTime;

    @JsonProperty("Description")
    private String _description;

    @JsonProperty("Notes")
    private List<String> _notes;

    @JsonProperty("ReferenceRange")
    private ReferenceRangeRep _referenceRange;

    @JsonProperty("RelatedGroupID")
    private String _relatedGroupId;

    @JsonProperty("Specimen")
    private SpecimenRep _specimen;

    @JsonProperty("Status")
    private String _status;

    @JsonProperty("Units")
    private String _units;

    @JsonProperty("Value")
    private Object _value;

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

    @JsonProperty("CompletionDateTime")
    public String getCompletionDateTime() {
        return _completionDateTime;
    }

    @JsonProperty("CompletionDateTime")
    public void setCompletionDateTime(final String completionDateTime) {
        _completionDateTime = completionDateTime;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return _description;
    }

    @JsonProperty("Description")
    public void setDescription(final String description) {
        _description = description;
    }

    @JsonProperty("Notes")
    public List<String> getNotes() {
        return _notes;
    }

    @JsonProperty("Notes")
    public void setNotes(final List<String> notes) {
        _notes = notes;
    }

    @JsonProperty("ReferenceRange")
    public ReferenceRangeRep getReferenceRange() {
        return _referenceRange;
    }

    @JsonProperty("ReferenceRange")
    public void setReferenceRange(final ReferenceRangeRep referenceRange) {
        _referenceRange = referenceRange;
    }

    @JsonProperty("RelatedGroupID")
    public String getRelatedGroupId() {
        return _relatedGroupId;
    }

    @JsonProperty("RelatedGroupID")
    public void setRelatedGroupId(final String relatedGroupId) {
        _relatedGroupId = relatedGroupId;
    }

    @JsonProperty("Specimen")
    public SpecimenRep getSpecimen() {
        return _specimen;
    }

    @JsonProperty("Specimen")
    public void setSpecimen(final SpecimenRep specimen) {
        _specimen = specimen;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return _status;
    }

    @JsonProperty("Status")
    public void setStatus(final String status) {
        _status = status;
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
    public Object getValue() {
        return _value;
    }

    @JsonProperty("Value")
    public void setValue(final Object value) {
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
