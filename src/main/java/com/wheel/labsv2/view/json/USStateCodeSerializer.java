package com.wheel.labsv2.view.json;

import com.wheel.labsv2.constants.USStateCode;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class USStateCodeSerializer extends StdSerializer<USStateCode> {

    protected USStateCodeSerializer() {
        super(USStateCode.class);
    }

    @Override
    public void serialize(
        USStateCode value,
        JsonGenerator gen,
        SerializerProvider provider
    ) throws IOException {
        gen.writeString(value.getAbbreviation());
    }
}
