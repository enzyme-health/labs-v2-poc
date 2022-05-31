package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaRep extends AbstractRedoxRep {

    @JsonProperty("DataModel")
    private String _dataModel;

    @JsonProperty("Destinations")
    private List<DestinationRep> _destinations = null;

    @JsonProperty("EventDateTime")
    private String _eventDateTime;

    @JsonProperty("EventType")
    private String _eventType;

    @JsonProperty("FacilityCode")
    private String _facilityCode;

    //patientpush, not patientquery
    @JsonProperty("Message")
    private MessageRep _message;

    //patientpush, not patientquery
    @JsonProperty("Source")
    private SourceRep _source;

    @JsonProperty("Test")
    private Boolean _test;

    //patientpush, not patientquery
    @JsonProperty("Transmission")
    private TransmissionRep _transmission;

    @JsonProperty("DataModel")
    public String getDataModel() {
        return _dataModel;
    }

    @JsonProperty("DataModel")
    public void setDataModel(String dataModel) {
        _dataModel = dataModel;
    }

    @JsonProperty("Destinations")
    public List<DestinationRep> getDestinations() {
        return _destinations;
    }

    @JsonProperty("Destinations")
    public void setDestinations(List<DestinationRep> destinations) {
        _destinations = destinations;
    }

    @JsonProperty("EventDateTime")
    public String getEventDateTime() {
        return _eventDateTime;
    }

    @JsonProperty("EventDateTime")
    public void setEventDateTime(String eventDateTime) {
        _eventDateTime = eventDateTime;
    }

    @JsonProperty("EventType")
    public String getEventType() {
        return _eventType;
    }

    @JsonProperty("EventType")
    public void setEventType(String eventType) {
        _eventType = eventType;
    }

    @JsonProperty("FacilityCode")
    public String getFacilityCode() {
        return _facilityCode;
    }

    @JsonProperty("FacilityCode")
    public void setFacilityCode(String facilityCode) {
        _facilityCode = facilityCode;
    }

    //patientpush, not patientquery
    @JsonProperty("Message")
    public MessageRep getMessage() {
        return _message;
    }

    @JsonProperty("Message")
    public void setMessage(MessageRep message) {
        _message = message;
    }

    //patientpush, not patientquery
    @JsonProperty("Source")
    public SourceRep getSource() {
        return _source;
    }

    @JsonProperty("Source")
    public void setSource(SourceRep source) {
        _source = source;
    }

    @JsonProperty("Test")
    public Boolean getTest() {
        return _test;
    }

    @JsonProperty("Test")
    public void setTest(Boolean test) {
        _test = test;
    }

    //patientpush, not patientquery
    @JsonProperty("Transmission")
    public TransmissionRep getTransmission() {
        return _transmission;
    }

    @JsonProperty("Transmission")
    public void setTransmission(TransmissionRep transmission) {
        _transmission = transmission;
    }

}
