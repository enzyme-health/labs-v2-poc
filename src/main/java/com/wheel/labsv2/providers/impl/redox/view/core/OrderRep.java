package com.wheel.labsv2.providers.impl.redox.view.core;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderRep extends AbstractRedoxRep {

    @JsonProperty("ApplicationOrderID")
    private String _applicationOrderId;

    @JsonProperty("CollectionDateTime")
    private String _collectionDateTime;

    @JsonProperty("Comments")
    private String _comments;

    @JsonProperty("CompletionDateTime")
    private String _completionDateTime;

    @JsonProperty("Expiration")
    private String _expiration;

    @JsonProperty("ID")
    private String _id;

    @JsonProperty("Notes")
    private List<String> _notes;

    @JsonProperty("Priority")
    private String _priority;

    @JsonProperty("Procedure")
    private ProcedureRep _procedure;

    @JsonProperty("Provider")
    private ProviderRep _provider;

    @JsonProperty("Specimen")
    private SpecimenRep _specimen;

    @JsonProperty("Status")
    private String _status;

    @JsonProperty("TransactionDateTime")
    private String _transactionDateTime;

    @JsonProperty("ApplicationOrderID")
    public String getApplicationOrderId() {
        return _applicationOrderId;
    }

    @JsonProperty("ApplicationOrderID")
    public void setApplicationOrderId(final String applicationOrderId) {
        _applicationOrderId = applicationOrderId;
    }

    @JsonProperty("CollectionDateTime")
    public String getCollectionDateTime() {
        return _collectionDateTime;
    }

    @JsonProperty("CollectionDateTime")
    public void setCollectionDateTime(final String collectionDateTime) {
        _collectionDateTime = collectionDateTime;
    }

    @JsonProperty("Comments")
    public String getComments() {
        return _comments;
    }

    @JsonProperty("Comments")
    public void setComments(final String comments) {
        _comments = comments;
    }

    @JsonProperty("CompletionDateTime")
    public String getCompletionDateTime() {
        return _completionDateTime;
    }

    @JsonProperty("CompletionDateTime")
    public void setCompletionDateTime(final String completionDateTime) {
        _completionDateTime = completionDateTime;
    }

    @JsonProperty("Expiration")
    public String getExpiration() {
        return _expiration;
    }

    @JsonProperty("Expiration")
    public void setExpiration(final String expiration) {
        _expiration = expiration;
    }

    @JsonProperty("ID")
    public String getId() {
        return _id;
    }

    @JsonProperty("ID")
    public void setId(final String id) {
        _id = id;
    }

    @JsonProperty("Notes")
    public List<String> getNotes() {
        return _notes;
    }

    @JsonProperty("Notes")
    public void setNotes(final List<String> notes) {
        _notes = notes;
    }

    @JsonProperty("Priority")
    public String getPriority() {
        return _priority;
    }

    @JsonProperty("Priority")
    public void setPriority(final String priority) {
        _priority = priority;
    }

    @JsonProperty("Procedure")
    public ProcedureRep getProcedure() {
        return _procedure;
    }

    @JsonProperty("Procedure")
    public void setProcedure(final ProcedureRep procedure) {
        _procedure = procedure;
    }

    @JsonProperty("Provider")
    public ProviderRep getProvider() {
        return _provider;
    }

    @JsonProperty("Provider")
    public void setProvider(final ProviderRep provider) {
        _provider = provider;
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

    @JsonProperty("TransactionDateTime")
    public String getTransactionDateTime() {
        return _transactionDateTime;
    }

    @JsonProperty("TransactionDateTime")
    public void setTransactionDateTime(final String transactionDateTime) {
        _transactionDateTime = transactionDateTime;
    }
}
