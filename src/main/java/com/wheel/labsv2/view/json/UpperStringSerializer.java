package com.wheel.labsv2.view.json;

import com.wheel.labsv2.utils.UpperString;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class UpperStringSerializer extends StdSerializer<UpperString> {

    protected UpperStringSerializer() {
        super(UpperString.class);
    }

    @Override
    public void serialize(
        UpperString value,
        JsonGenerator gen,
        SerializerProvider provider
    ) throws IOException {
        gen.writeString(value.toString());
    }

}
