package com.wheel.labsv2.providers.impl.redox.view.events;

import com.wheel.labsv2.providers.impl.redox.view.core.OrderRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractOrderEventRep extends AbstractRedoxEventRep {

    @JsonProperty("Order")
    private OrderRep _order;

    @JsonProperty("Order")
    public OrderRep getOrder() {
        return _order;
    }

    @JsonProperty("Order")
    public void setOrder(final OrderRep order) {
        _order = order;
    }
}
