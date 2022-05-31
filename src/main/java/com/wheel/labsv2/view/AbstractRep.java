package com.wheel.labsv2.view;

import com.wheel.labsv2.view.json.WObjectMapperFactory;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JsonFilter("dataWarehouse")
@JsonPropertyOrder(alphabetic = true)
public abstract class AbstractRep {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractRep.class);

    public String toDataWarehouseJson() throws JsonProcessingException {
        final ObjectMapper mapper = WObjectMapperFactory.getDataWarehouseObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public String toJson() throws JsonProcessingException {
        final ObjectMapper mapper = WObjectMapperFactory.getObjectMapper();
        return mapper.writeValueAsString(this);
    }

    public String toJsonRisky() {
        try {
            return toJson();
        } catch(JsonProcessingException e) {
            LOG.error(
                "Error serializing JSON for " + getClass().getName(),
                e
            );
            return e.getMessage();
        }
    }

    @Override
    public String toString() {
        try {
            return this.toJson();
        } catch(JsonProcessingException e) {
            LOG.error(
                "Error serializing rep",
                e
            );
            return super.toString();
        }
    }
}
