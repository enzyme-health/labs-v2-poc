package com.wheel.labsv2.providers.impl.redox.view.events;

import com.wheel.labsv2.providers.impl.redox.view.core.OrderRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupedOrderEventRep extends AbstractRedoxEventRep {

    @JsonProperty("Orders")
    private List<OrderRep> _orders;

    @JsonProperty("Orders")
    public List<OrderRep> getOrders() {
        return _orders;
    }

    @JsonProperty("Orders")
    public void setOrders(final List<OrderRep> orders) {
        _orders = orders;
    }
}
