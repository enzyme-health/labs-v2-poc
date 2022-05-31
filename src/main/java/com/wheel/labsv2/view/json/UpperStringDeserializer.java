package com.wheel.labsv2.view.json;

import com.wheel.labsv2.utils.UpperString;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class UpperStringDeserializer extends StdDeserializer<UpperString> {

    public UpperStringDeserializer() {
        this(null);
    }

    public UpperStringDeserializer(Class<UpperString> t) {
        super(t);
    }

    @Override
    public UpperString deserialize(
        final JsonParser jp,
        final DeserializationContext ctxt
    ) throws IOException {
        final JsonNode node = jp.getCodec()
            .readTree(jp);
        final String nodeText = node.asText();
        return UpperString.build(nodeText);
    }
}
