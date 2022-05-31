package com.wheel.labsv2.providers.impl.redox.view.events;

import com.wheel.labsv2.providers.impl.redox.view.core.OrderResultsRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewResultsEventRep extends AbstractRedoxEventRep {

    @JsonProperty("Orders")
    private List<OrderResultsRep> _orders;

    @JsonProperty("Orders")
    public List<OrderResultsRep> getOrders() {
        return _orders;
    }

    @JsonProperty("Orders")
    public void setOrders(final List<OrderResultsRep> orders) {
        _orders = orders;
    }

}
