package com.wheel.labsv2.view.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.Instant;

public class InstantSerializer extends StdSerializer<Instant> {

    public InstantSerializer() {
        this(null);
    }

    public InstantSerializer(Class<Instant> t) {
        super(t);
    }

    @Override
    public void serialize(
        final Instant value,
        final JsonGenerator gen,
        final SerializerProvider provider
    ) throws IOException {
        final Instant toUse = Instant.ofEpochSecond(value.getEpochSecond());
        gen.writeString(toUse.toString());
    }

}
