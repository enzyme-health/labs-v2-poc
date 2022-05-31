package com.wheel.labsv2.providers.impl.redox.view.events;

import com.wheel.labsv2.providers.impl.redox.view.AbstractRedoxRep;
import com.wheel.labsv2.providers.impl.redox.view.core.MetaRep;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasicRedoxResponseRep extends AbstractRedoxRep {

    @JsonProperty("Meta")
    private MetaRep _meta;

    @JsonProperty("Meta")
    public MetaRep getMeta() {
        return _meta;
    }

    @JsonProperty("Meta")
    public void setMeta(final MetaRep meta) {
        _meta = meta;
    }

}
