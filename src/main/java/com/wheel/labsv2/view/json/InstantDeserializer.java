package com.wheel.labsv2.view.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;

public class InstantDeserializer extends StdDeserializer<Instant> {

    public InstantDeserializer() {
        this(null);
    }

    public InstantDeserializer(Class<Instant> clazz) {
        super(clazz);
    }

    @Override
    public Instant deserialize(
        JsonParser jp,
        DeserializationContext ctxt
    ) throws IOException {
        final JsonNode node = jp.getCodec()
            .readTree(jp);
        final String nodeText = node.asText();

        // Uses ISO_INSTANT format variants
        return OffsetDateTime.parse(nodeText)
            .toInstant();
    }
}
